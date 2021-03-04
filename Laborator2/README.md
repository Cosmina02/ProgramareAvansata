Pentru a rezolva problema transportului si pentru a afla costul total am folosit datele din clasa problema.
astfel pentru fiecare sursa calculez costul minim. Cand am aflat care este costul minim atunci verific daca stocul(supply) este mai mic,mai mare sau egal cu cererea(demand).
Daca stocul pe care il are sursa este mai mare decat cererea cu costul minim atunci umplem o pozitia i,j(i sursa,j destinatie) dintr-omatrice cu valoarea cererii(matricea solutie), dupa care din stocul pe care il aveam scadem cererea(cat a dat sursa).
Daca stocul pe care il are sursa este mai mic decat cererea atunci sursa da catre destinatie tot stocul,se completeaza matricea in continuare dupa care se face update atat pentru cerere cat si pentru stoc.
Daca in urma acestor operatii stocul nu este egal cu 0 atunci calculam destinatia cu cererea cea mai mare(maximul) si repetam comparatiile ca mai sus.
