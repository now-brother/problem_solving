package java.programmers.신규아이디추천;

class Solution {
    private String level1(String s){
        String news = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                news += Character.toLowerCase(s.charAt(i));
            }else{
                news += s.charAt(i);
            }
            
        }
        return news;
    }
    
    private String level2(String s){
        String news = "";
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                news += s.charAt(i);
            }else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                news += s.charAt(i);
            }else if(s.charAt(i) == '-' || s.charAt(i) == '_' || s.charAt(i) == '.'){
                news += s.charAt(i);
            }else{
                continue;
            }
        }
        
        return news;
    }
    
    private String level3(String s){
        String news = "";
        boolean flag = false;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '.'){
                if(flag){
                    continue;
                }else{
                    news += s.charAt(i);
                    flag = true;
                }
            }else{
                if(flag){
                    flag = false;
                    news += s.charAt(i);
                }else{
                    news += s.charAt(i);
                }
            }
        }
        
        return news;
    }
    
    private String level4(String s){
        String news = "";
        
        if(s != null){
            if(s.charAt(0) == '.'){
                if(s.length() > 1){
                    news = s.substring(1 , s.length());
                }else{
                    news = "";
                }
            }else{
                news = s;
            } 
        }
        
        if(news.length() > 1){
            if(news.charAt(news.length() - 1) == '.'){
                news = news.substring(0,news.length() - 1);
            }
        }
        return news;
    }
    
    private String level5(String s){
        if(s.isEmpty())
            return "a";
        return s;
    }
    
    private String level6(String s){
        String news = "";
        if(s.length() > 15){
            for(int i = 0; i < 15; i++){
                if(i == 14){
                    if(s.charAt(i) == '.'){
                        break;
                    }else{
                        news += s.charAt(i);
                    }
                }else{
                   news += s.charAt(i);
                }
            }
        }else{
            return s;
        }
        
        return news;
    }
    
    private String level7(String s){
        char c;
        
        if(s.length() > 2){
            return s;
        }
        c = s.charAt(s.length() - 1);
        while(true){
            if(s.length() == 3)
                break;
            s += c;
        }
        
        return s;
    }
    
    public String solution(String new_id) {
        String answer = "";
        
        answer = level1(new_id);
        answer = level2(answer);
        answer = level3(answer);
        answer = level4(answer);
        answer = level5(answer);
        answer = level6(answer);
        answer = level7(answer);
        
        return answer;
    }
}