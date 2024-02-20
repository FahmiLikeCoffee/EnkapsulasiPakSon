package user;

public class Enkapsulasi_Pson {

    public static void main(String[] args) {
        
        User fahmi = new User("fahmi","Aktif");
        
        fahmi.setUsername("Fahmi");
        fahmi.setPassword("Aktif");
        fahmi.setId("1111");
        
        System.out.println("Username : "+fahmi.getUsername());
        System.out.println("Username : "+fahmi.getPassword());
        
    }
    
}