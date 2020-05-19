package hello;
import org.springframework.stereotype.Component;
@Component
public class CountService {
    public int count(String word){
        return word.length();
    }
    public Integer age(String age){
        Integer t=0;
        try{
                t=Integer.parseInt(age);
        }catch(NumberFormatException e){
            t=0;
        }
        return t;
    }
    public String show(String content){
        return content;
}
    public boolean ciag(String str){
            String content=str;
            String originalString="abcdefghijk";
            boolean find=false;
            for(int i=0;i<originalString.length();i++){
                if(originalString.charAt(i)==content.charAt(0)){
                    find=true;
                    for(int j=1;j<content.length();j++){

                        if(content.charAt(j)!=originalString.charAt(i+j)){
                            find=false;
                            break;
                        }
                    }
                }
            }
            return find;
        }
    public String woMan(String str){
        if(str.endsWith("a")){return "Madam";}
        else if(str.length()>1) return "Gentleman";
        else return "Nobody";
    }
}