package lab6;

public class TV {
private boolean state = false;
private int volume = 10;
public int channel = 2;
///set
//channel
public void setChannel(int chan){
channel = chan;
}
//volume
public void setVolumeUp(){
if (volume < 20){
volume++;
}
}
public void setVolumeDown(){
if (volume >= 0){
volume--;
}
}
public void powerButton(){
state = !state;
}
///get
//channel
public int getChannel(){
return channel;
}
//volume
public int getVolume(){
return volume;
}
public String state(){
if (state){
return "on";
}else{
return "off";
}
}
public String toString(){
return "TV status everything" +
"\nchannel : " + getChannel() +
"\nvolume : " + getVolume() +
"\nstatus : " + state() ;
}
}