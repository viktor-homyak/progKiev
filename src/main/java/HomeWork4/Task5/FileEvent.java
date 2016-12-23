package HomeWork4.Task5;

import java.util.Date;

public class FileEvent implements IFileEvent {
	@Override
	public void onFileAdded(String s) {
		System.out.println("FileTxt added: " + s );
	}
	@Override
	public void  GetFileDate(long FileDate){
		Date d=  new Date(FileDate);
		System.out.println(d );
	};
}
