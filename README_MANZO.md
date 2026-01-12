# Progetto Orchid 

## Classi Entities: 
1. Availability = gestisce le disponibilita delle camere 
2. Booking = gestisce le varie informazioni riguardanti le prenotazioni 
3. Customer = gestisce le informazioni dei clienti della struttura 
4. Lead = gestisce le informazioni dei leads 
5. Property = gestisce le informazioni riguardanti le stanze della struttura 
6. PropertyImage = gestisce le immagine delle stanze della struttura 

## Classi Enums: 
1. AvailibiltyType = gestisce le possibili situazioni che potrebbe avere ciascuna stanza 

## Relazioni: 
1. Relazione Property-Booking (1-M) 
2. Relazione Property-PropertyImage (1-M) 
3. Relazione Property-Availability (1-M) 
4. Relazione Booking-Customer (M-1)

