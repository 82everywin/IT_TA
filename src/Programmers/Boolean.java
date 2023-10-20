package Programmers;

public class Boolean {
	public static boolean sum(boolean x, boolean y){
        if (x==true && y==true){ return true;
        }else if(x==true && y==false){ return true;
        }else if(x==false && y==true){ return true;
        }else {
            return false;
        }
    }
    
    public static boolean inter(boolean x, boolean y){
        if (x==true && y==true){ return true;
        }else if(x==true && y==false){ return false;
        }else if(x==false && y==true){ return false;
        }else{
            return false;
        }
    }
    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {

        boolean one_two = sum(x1,x2);
        boolean three_four = sum(x3,x4);
        
        return inter(one_two,three_four);
    }
    
    public static void main(String[] args) {
		System.out.println(solution(true,false,false,false));
	}
    
}
