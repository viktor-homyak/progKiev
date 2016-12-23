package HomeWork4.Task5;

import java.io.File;

public class Monitor {
	String file;
	IFileEvent event;
	 private static long FileDate;

	public Monitor(String file, IFileEvent event) {
		this.file = file;
		this.event = event;
	}

	
	public void start() {
		while (true) {
			File f = new File(file);
			
			if (f.exists() && f.isFile()) {
				if (event != null)
					FileDate = f.lastModified();
					event.onFileAdded(file);
				event.GetFileDate(FileDate);
				break;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			System.out.println("Waiting...");
		}
	}
}
// lastModified()
