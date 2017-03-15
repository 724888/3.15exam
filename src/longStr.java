/**
 * Created by 周杰伦 on 2017/3/15.
 */


import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/15.
 */
public class longStr {
    int findlongstr(char []str){
        if(str==null){return 0;}
        int max=1;
        int j;

        for(int i=0;i<str.length;i++){
            int len=1;
            j=i+1;
            while(j<str.length && str[j]!=str[j-1]  ){len++;j++;}
            if(len>max)max=len;
            i=j-1;

        }
        return max;
    }
    @Test
    public void test(){
        char []str=null;
        System.out.println(findlongstr(str));

    }
}

