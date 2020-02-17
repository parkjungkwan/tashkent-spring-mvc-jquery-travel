package texas.sbq.travel.proxies;

import java.io.File;
import java.util.UUID;
import java.util.function.BiFunction;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import texas.sbq.travel.enums.Path;

@Component
public class Filer   {
	
	public void save(MultipartFile[] uploadFile, String directory) {
		String uploadFolder = Path.UPLOAD_PATH.toString();
		File uploadPath = makeDir(uploadFolder, directory);
		
		if(uploadPath.exists() == false) {
			uploadPath.mkdirs();
		}
		final String s = directory;
		for(MultipartFile m : uploadFile) {
			String fname = m.getOriginalFilename();
			String extension = fname.substring(fname.lastIndexOf(".")+1);
			fname = fname.substring(fname.lastIndexOf("\\")+1, fname.lastIndexOf("."));
			File savedFile = makeFile(uploadPath, fname+"-"+UUID.randomUUID().toString()+"."+extension);
			try {
				m.transferTo(savedFile);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
	public File makeDir(String t, String u) {
		BiFunction<String,String, File> f = File::new;
		return f.apply(t, u);
	}
	public File makeFile(File t, String u) {
		BiFunction<File,String, File> f = File::new;
		return f.apply(t, u);
	}
}