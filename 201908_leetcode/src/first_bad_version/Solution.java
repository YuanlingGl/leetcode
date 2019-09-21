package first_bad_version;

/**
 * @program: 20190822——leetcode
 * @description:
 * @author: dd
 * @created: 2019/09/10 21:19
 */
/*public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int newpoint = 1;
        int oldpoint = n;
        boolean end = true;
        while (newpoint<oldpoint){
            int tmppoint=newpoint+(oldpoint-newpoint)/2;
            if (isBadVersion(tmppoint)){
                oldpoint=tmppoint;
            }else{
                newpoint=tmppoint+1;
            }
        }
        return newpoint;
    }
}*/
//isBadVersion api是外部提供的