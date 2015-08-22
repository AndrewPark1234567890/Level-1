
public class Minion {
String name;
int eyes;
String color;
String master;
public Minion(String name, int eyes, String color, String master){
	this.color = color;
	this.eyes = eyes;
	this.master = master;
	this.name = name;
}
 String getName(){
	return name;
}
 String getColor(){
	return color;
}
 int getEyes(){
	return eyes;
}
 String getMaster(){
	return master;
}
 void setMaster(String master){
	 this.master = master;
 }
}
