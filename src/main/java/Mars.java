
import java.util.Arrays;
import java.util.List;

public class Mars {
    private String areamove="";
    private String point="";
    private String forward ="";
    private int x;
    private int y;
    public void land(String area, String s) {
        areamove=area;
        point=s.replace(",","");
        x=Integer.valueOf(point.substring(0,1));
        y=Integer.valueOf(point.substring(1,2));
        forward =point.substring(2);
    }
    public void move(){
       if("N".equals(forward)){
            y=y-1;
       }
       if("E".equals(forward)){
           x=x+1;
       }
       if("W".equals(forward)){
           x=x-1;
       }
       if("S".equals(forward)){
           y=y+1;
       }

    };
    public void right(){
        if("N".equals(forward)){
            forward="E";
            return;
        }
        if("E".equals(forward)){
            forward="S";
            return;
        }
        if("W".equals(forward)){
            forward="N";
            return;
        }
        if("S".equals(forward)){
            forward="W";
            return;
        }
    }
    public void left(){
        if("N".equals(forward)){
            forward="W";
            return;
        }
        if("E".equals(forward)){
            forward="N";
            return;
        }
        if("W".equals(forward)){
            forward="S";
            return;
        }
        if("S".equals(forward)){
            forward="E";
            return;
        }

    }
    public void collection(String collection) {
        String areas= collection.substring(0,5);
        String s=collection.substring(6,11);
        this.land(areas,s);
        String collec=collection.substring(12,collection.length());
        List<String> list = Arrays.asList(collec.split(","));
        for (String command:list){
            if ("L".equals(command)){
                this.left();
            }
            if("R".equals(command)){
                this.right();
            }
            if ("M".equals(command)){
                this.move();
            }
        }

    }
    public String getPoint() {
        List<String> areaList = Arrays.asList(areamove.split(","));
        int outx=Integer.valueOf(areaList.get(0));
        int outy=Integer.valueOf(areaList.get(1));
        if(x>outx||y>outy){
            throw new RuntimeException("已超出范围，不能再继续移动");
        }
        point=""+x+y+forward;
        return point;
    }

}
