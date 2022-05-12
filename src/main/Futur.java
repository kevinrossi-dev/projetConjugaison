package main;

public class Futur extends Temp{
    public Futur(String temp){
        if(!(temp.trim().equalsIgnoreCase("futur")))
            throw new IllegalArgumentException();
    }

    @Override
    public String conjugue(Verbe v) {
        StringBuilder sb = new StringBuilder();
        sb.append(v.conjugue1erePersonneSingulierFutur()+'\n');
        sb.append(v.conjugue2emePersonneSingulierFutur()+'\n');
        sb.append(v.conjugue3emePersonneSingulierFutur()+'\n');
        sb.append(v.conjugue1erePersonnePlurielFutur()+'\n');
        sb.append(v.conjugue2emePersonnePlurielFutur()+'\n');
        sb.append(v.conjugue3emePersonnePlurielFutur()+'\n');


        return sb.toString();
    }
}
