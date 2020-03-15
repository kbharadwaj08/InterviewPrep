import java.io.*;

public class readATextFile {

public static void main(String Arg[]) throws IOException {
    //File file = new File();
    FileReader fr = new FileReader("D:\\TestFile.txt");
    BufferedReader br = new BufferedReader(fr);

    String line = null;
    while((line = br.readLine()) != null) {
        System.out.println(line);
    }

    String[] str = line.split(",");
    int[] num = new int[str.length];
    int temp =0;
    //int[] num10 = new int[];
    for(int i=0;i<=str.length;i++) {
        num[i] = Integer.parseInt(str[i]);
        if(num[i] > num[i+1])
        {
            temp = num[i];
            num[i] = num[i+1];
            num[i+1] = temp;
        }
    }

    for(int j=9;j<=0;j--)
    {
        System.out.println(num[j]);
    }

}

}
