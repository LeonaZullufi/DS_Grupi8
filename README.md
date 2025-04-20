# 🔐 Java Message Cipher App – Scytale & Pigpen

Ky aplikacion Java lejon përdoruesin të enkriptojë dhe dekriptojë mesazhe duke përdorur dy algoritme klasike të kriptografisë:

- **Scytale Transposition Cipher**
- **Pigpen Cipher**

---

## 🧰 Kërkesat për ekzekutim

- Java 8 ose më i ri
- IDE (p.sh. IntelliJ IDEA, Eclipse) ose terminal
- `Main.java`, `ScytaleTransposition.java`, `PigpenCipher.java`

---

## 🚀 Si të ekzekutohet programi

### Përmes IDE-së:
1. Hap projektin në IntelliJ IDEA ose IDE-në tënde të preferuar.
2. Ekzekuto `Main.java`.

 ```
 Përmes terminalit:

javac Main.java
java Main
 ```
## 📋 Udhëzime për përdorim
Pas nisjes së programit, do të udhëhiqeni përmes terminalit për të zgjedhur:
  
 
1️⃣ Zgjedhja e algoritmit:
```
Zgjedh algoritmin:
[1] - Scytale Transposition
[2] - Pigpen Cipher    
 ```

2️⃣ Zgjedhja e veprimit:
```
Zgjedh veprimin:
[1] - Enkriptim
[2] - Dekriptim
```

🔄 Logjika e rrjedhës
Pas përfundimit të një enkriptimi/dekriptimi, programi ofron opsione për:
```bash
Dëshiron të vazhdosh programin:
[P] - Po
[J] - Jo
```
Nëse shtypni P, programi ju çon sërish te zgjedhja e algoritmit. \
Nëse J, programi përfundon.


## Përshkrimi i algoritmit
Pigpen Cipher (i njohur edhe si Masonic Cipher) është një algoritëm
kriptografik zëvendësimi gjeometrik që përdor simbole të thjeshta bazuar 
në pozicione të një rrjete (Grid) për të përfaqësuar shkronjat e alfabetit. 
Ky algoritem ka qenë i përdorur historikisht nga Masonët dhe është një nga metodat 
më të njohura vizuale të enkriptimit.\
Pigpen Cipher është i lehtë për t'u kuptuar, ai nuk ofron siguri reale, 
pasi struktura e tij është e njohur gjerësisht. Kjo e bën të dobët kundër 
sulmeve të thjeshta kriptografike, pasi një sulmues mund ta deshifrojë direkt 
pa pasur nevojë për celës sekret.

Struktura e rrjetave:
![img_2.png](img_2.png)
## Shembuj të rezultateve të ekzekutimit
### Pigpen / Masonic Cipher

#### Shembull 1
Enkriptimi \
Plaintext: Masonic
![img_3.png](img_3.png)

Dekriptimi \
Ciphertext: •⊐ ─┘ \/ ⊏• ⊡ ┌─ └─ 
![img_4.png](img_4.png)
