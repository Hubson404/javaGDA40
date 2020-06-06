package sda.wzorce.facade.systemy;

public class Main {

    public static void main(String[] args) {
        Potwierdzenie potwierdzenieLotu = SystemLotow.get().zarezerwujLot(null, null);
        Potwierdzenie potwierdzenieHotelu = SystemHotelowy.get().zarezerwujHotel(null, null, null);
        boolean isPotwierdzenieOK = true;
        if(isPotwierdzenieOK) {
            System.out.println(new Potwierdzenie("Potweirdznie wycieczeki"));
        }
    }
}
