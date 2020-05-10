import java.io.*;

public class CopyBinaryFile {
    void copy(File departure, File destination) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
            inputStream = new FileInputStream(departure);
            outputStream = new FileOutputStream(destination);
            byte[] myByte = new byte[1024];
            int length;
            while ((length = inputStream.read(myByte)) > 0){
                outputStream.write(myByte, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
