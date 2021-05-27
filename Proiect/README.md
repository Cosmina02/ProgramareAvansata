# ExamNet

Definirea unui format XML pentru reprezentarea unor teste formate din
intrebari grila si enunturi de probleme, respectiv pentru preluarea solutiilor
- Crearea unor servicii pentru transmiterea testelor, preluare rezultatelor
- Optional: crearea unei interfete Web
- Similar cu examinarea implementata pe platforma pbinfo

Pentru dezvoltarea acestui proiect am folosit Spring Boot impreuna cu Thymeleaf pentru a crea paginile web si pentru a face redirectionarea de la o pagina la alta.
Pentru preluarea intrebarilor,raspunurilor si a problemelor am folosit JDBC pentru lucrul cu baza de date.
Pentru generarea fisierelor de tip XML am folosit JDOM Parser.
