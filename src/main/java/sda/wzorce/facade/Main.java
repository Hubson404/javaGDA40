package sda.wzorce.facade;


public class Main {
    public static void main(String[] args) {
        // TODO Ćwiczenie: Fasada
        // TODO 1) stwórz fasadę i użyj jej do rezerwacji kompleksowej wycieczki (składającej się z lotu, hotelu i przejazdu taxi)

       // Potwierdzenie potwierdzenieWycieczkiDoStolicy = SystemBiuraPodrozy.biuro.zarezerwujWycieczke("Warszawa", LocalDate.of(2019, 12, 1), 3);

     //   System.out.println(potwierdzenieWycieczkiDoStolicy);


        // TODO 2) pozwól na pozostałe sensowne warianty wycieczek (np. lot+hotel+wynajemAuta, lot+wynajemAuta, hotel+taxi)
        // TODO 3) dodaj "integrację" z "innymi" systemami (np. system rezerwacji biletów PKP)
        // TODO 4) dodaj możliwość odwoływania rezerwacji (podpowiedź: należałoby dodac w każdym systemie przechowywanie wydanych "potwierdzeń" i pozwolić na ich anulowanie)

        // TODO Ćwiczenie: Proxy (pełnomocnik)
        // TODO 1) stwórz pełnomocnika "sprytne odwołanie", który będzie zliczał, ile rezerwacji zostało wykonanych w systemie hotelowym. Prawidłowo obsłuż również rezerwacje anulowane
        // TODO 2) niech pełnomocnik monitoruje liczbę nakładających się rezerwacji. Jeżeli w systemie hotelowym będa w tym samym czasie dwie rezerwacje (które nakładają się chociaż jednym dniem), to przy dodaniu trzeciej (nakładającej) niech wyświelta ostrzeżenie, że jej cena może być podwyższona
        // TODO 3) zmodyfikuj pełnomocnika tak, aby był również proxy ochraniającym - w sytuacji powyżej niech odmówi wywołania metody rezerwującej hotel

        // TODO Ćwiczenie: Obserwator
        // TODO 1) Rozbuduj system korporacji taxi o listę wszystkich taksówkarzy, któzy się w niej zarejestrowali.
        // TODO 2) W momencie przybycia nowego zlecenia - wyślij powiadomienie do wszystkich aktywnych taksówkarzy w korporacji


    }
}
