package utilities;

import java.io.File;

public class RanaMethod {

    public static boolean  check_file_exist_and_delete(String file_name)
    {
        ReusableMethods.bekle(4);
        File downloaddir = new File(System.getProperty("user.dir") + "\\downloads");
        System.out.println(downloaddir.toString());
        File[] files = downloaddir.listFiles();

        if (files != null) {
            for (File file : files) {
                // Check if the file name contains the specific string
                System.out.println(file.getName());
                if (file.getName().contains(file_name)) {
                    System.out.println("Found file: " + file.getName());
                    return true; // Return true if a matching file is found
                }
            }
        }
        return false; // No file found with the specific string
    }

    public static void deleteDownloadFolder() {
        // Delete all files inside the folder
        File downloaddir = new File(System.getProperty("user.dir") + "\\downloads");
        File[] files = downloaddir.listFiles();
        if (files != null) { // Check if the folder contains files
            for (File file : files) {
                file.delete(); // Delete each file
            }
        }
        // Finally, delete the folder itself
        downloaddir.delete(); // Delete the folder after the contents are removed
        System.out.println("Download klasoru basariyla silindi");
    }
}

