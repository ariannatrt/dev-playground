# Progetto Orchid

### Property (it.test.entities.Property)
- Classe Entity che rappresenta una stanza/appartamento da affittare.

    **Campi principali**:
    - 'nome', 'descrizione', 'localita' : String (length = 255, nullable = false)
    - 'prezzoPerNotte' : double (nullable = false)
    - 'maxOspiti' : int (nullable = false)

    **Relazioni**:
    - '@OneToMany PropertyImage' (mappedBy = "property", cascade = ALL)
        1-M tra la classe Property e PropertyImage.
    - '@OneToMany Booking' (mappedBy = "property", cascade = ALL)
        1-M tra la classe Property e Booking.
    - '@OneToMany Availability' (mappedBy = "property", cascade = ALL)
        1-M tra la classe Property e Availability.

    **Scelte**:
    - Cascade.ALL per propagare automaticamente alle entity collegate save/delete.
    - GenerationType.IDENTITY per AUTO-INCREMENT ID MySQL.

### PropertyImage (it.test.entities.PropertyImage)
- Classe Entity che rappresenta le immagini di una stanza/appartamento.

    **Campi principali**:
    - 'urlImmagine' : String (length = 1024, nullable = false)

    **Relazioni**:
    - '@ManyToOne Property' (fetch = FetchType.LAZY)
        M-1 tra la classe PropertyImage e Property.

    **Scelte**:
    - FetchType.LAZY per non caricare le stanze/appartamenti quando non necessario.
    - GenerationType.IDENTITY per AUTO-INCREMENT ID MySQL.

### Customer (it.test.entities.Customer)
- Classe Entity che rappresenta un cliente.

    **Campi principali**:
    - 'firstName', 'lastName', 'email', 'phone': String (length = 255, nullable = false)

    **Relazioni**:
    - '@OneToMany Booking' (mappedBy = "customer", cascade = ALL)

    **Scelte**:
    - Cascade.ALL per propagare automaticamente alle entity collegate save/delete.
    - GenerationType.IDENTITY per AUTO-INCREMENT ID MySQL.

### Booking (it.test.entities.Booking)
- Classe Entity che rappresenta una prenotazione di una stanza/appartamento.

    **Campi principali**:
    - 'checkIn', 'checkOut' : LocalDateTime (nullable = false)
    - 'guests' : int (nullable = false)
    - 'totalPrice' : double (nullable = false)

    **Relazioni**:
    - '@ManyToOne Property' (fetch = FetchType.LAZY)
        M-1 tra la classe Booking e Property.
    - '@ManyToOne Customer' (fetch = FetchType.LAZY)
        M-1 tra la classe Booking e Customer.

    **Scelte**:   
    - FetchType.LAZY per non caricare le stanze/appartamenti ed i clienti quando non necessario. 
    - GenerationType.IDENTITY per AUTO-INCREMENT ID MySQL

### Availability (it.test.entities.Availability)
- Classe Entity che rappresenta la disponibilità di una stanza/appartamento.

    **Campi principali**:
    - 'startDate', 'endDate' : LocalDate (nullable = false)
    - 'stato' : String (length = 255, nullable = false)

    **Relazioni**:
    - '@ManyToOne Property' (fetch = FetchType.LAZY)
        M-1 tra la classe Availability e Property.

    **Scelte**:    
    - FetchType.LAZY per non caricare le stanze/appartamenti quando non necessario.
    - GenerationType.IDENTITY per AUTO-INCREMENT ID MySQL.

### Lead (it.test.entities.Lead)
- Classe Entity che rappresenta un lead di una prenotazione.

    **Campi principali**:
    - 'nome', 'email', 'fonte': String (length = 255, nullable = false)
    - 'createAt' : LocalDateTime (nullable = false)

    **Scelte**:
    - GenerationType.IDENTITY per AUTO-INCREMENT ID MySQL.
    

    




