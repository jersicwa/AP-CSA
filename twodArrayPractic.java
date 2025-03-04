import java.util.Arrays;

public class twodArrayPractic {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int num=1;
        int [][] newArr = new int[3][3];
        for (int j = 0; j < newArr[0].length; j++) {
            for (int i = 0; i < newArr.length; i++) {

                newArr[i][j] = num;
                num++;
                System.out.println(newArr[i][j]);
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(newArr));
    }
    }

private List<DownloadInfo> downloadList;
public MusicDownloads()
{
    downloadList = new ArrayList<DownloadInfo>();
}
public DownloadInfo getDownloadInfo(String title)
{
    for(int i=0;i<downloadList.size();i++)
    {
        DownloadInfo music = downloadList.get(i);
        String musicTitle = music.getTitle();
        if(musicTitle.equals(title))
        {
            return music;
        }
    }
    return null;
}

public void updateDownloads(List<String> titles)
{
    for(int i=0;i<titles.size();i++)
    {
        String title = titles.get(i);
        DownloadInfo obj = getDownloadInfo(title);
        if(obj==null)
        {
            obj = new DownloadInfo(title);
            downloadList.add(obj);
        }
        else
        {
            obj.incrementTimesDownloaded();
        }
    }
}