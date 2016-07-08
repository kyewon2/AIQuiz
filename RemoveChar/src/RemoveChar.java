/**
 * Created by Kyewon on 2016. 7. 8..
 *
 */
public class RemoveChar {
    public RemoveChar(){}

    /**
     * 제거 할 문자열이 하나일때
     */
    public void rmChar(String str, char removeChar){
        StringBuffer strBuffer = new StringBuffer();

        for(int i = 0; i < str.length(); i ++){
                if (str.charAt(i) != removeChar) {
                    strBuffer.append(str.charAt(i));
                }
            }
        System.out.println(strBuffer.toString());
    }

    /**
     * 제거 할 문자열이 두개 이상일때
     */
    public void rmChars(String str, String removeChars){
        StringBuffer strBuffer = new StringBuffer();

        for(int i = 0; i < str.length(); i ++){
            for(int j = 0; j < removeChars.length(); j ++){
                if(str.charAt(i) == removeChars.charAt(j))
                    str = str.replace(str.charAt(i),' '); //제거할 문자 빈 문자로 대체
            }
            if(str.charAt(i) != ' ') //빈 문자열을 없앤다
            strBuffer.append(str.charAt(i));
        }
        System.out.println(strBuffer.toString());
    }
}
