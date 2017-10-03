public class Point{
    int x;
    int y;
    String name;

    Point(){
	this.x=0;
	this.y=0;
	this.name="NULL";
    }
    Point(int x,int y){
	this.x=x;
	this.y=y;
	this.name="NULL";
    }
    Point(int x,int y,String name){
	this.x=x;
	this.y=y;
	this.name=name;
    }

    int getPosX(){
	return x;
    }
    int getPosY(){
	return y;
    }
    String getName(){
	return name;
    }

    void setPosX(int sx){
	x=sx;
    }
    void setPosY(int sy){
	y=sy;
    }
    void setName(String sname){
	name=sname;
    }
}
