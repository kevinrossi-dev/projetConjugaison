package main;

public class Present extends Temp{
    public Present(String temp){
        if(!(temp.trim().equalsIgnoreCase("présent")))
            throw new IllegalArgumentException();
    }

    @Override
    public String conjugue(Verbe v) {
        StringBuilder sb = new StringBuilder();
        sb.append(v.conjugue1erePersonneSingulier()+'\n');
        sb.append(v.conjugue2emePersonneSingulier()+'\n');
        sb.append(v.conjugue3emePersonneSingulier()+'\n');
        sb.append(v.conjugue1erePersonnePluriel()+'\n');
        sb.append(v.conjugue2emePersonnePluriel()+'\n');
        sb.append(v.conjugue3emePersonnePluriel()+'\n');


        return sb.toString();
    }
}
