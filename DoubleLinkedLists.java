
public class DoubleLinkedLists {
    BarangRental head;
    TransaksiRental head2;
    int size;

    DoubleLinkedLists(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa){
        if(isEmpty()){
            head = new BarangRental(null, noTNKB, namaKendaraan,jenisKendaraan, tahun, biayaSewa , null);
        } else {
            BarangRental newNode = new BarangRental(null, noTNKB, namaKendaraan,jenisKendaraan, tahun, biayaSewa , head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast (String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa){
        if(isEmpty()){
            addFirst(noTNKB, namaKendaraan,jenisKendaraan, tahun, biayaSewa);
        } else {
            BarangRental current = head;
            while (current.next != null){
                current = current.next;
            }
            BarangRental newNode = new BarangRental(current, noTNKB, namaKendaraan,jenisKendaraan, tahun, biayaSewa, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa, int index) throws Exception {
        if(isEmpty()){
            addFirst(noTNKB, namaKendaraan,jenisKendaraan, tahun, biayaSewa);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        } else {
            BarangRental current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            } 
            if(current.prev == null){
                BarangRental newNode = new BarangRental(null, noTNKB, namaKendaraan,jenisKendaraan, tahun, biayaSewa, current);
                current.prev = newNode;
                head = newNode;
            } else {
                BarangRental newNode = new BarangRental(current.prev, noTNKB, namaKendaraan,jenisKendaraan, tahun, biayaSewa, current);
                newNode.prev = current.prev;
                newNode.next = current;
                newNode.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if(!isEmpty()){
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Kendaraan Rental Serba Serbi");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("| " + "Nomor TNKB" + "| " + "Nama Kendaraan" + "| " + "Jenis" + "| " + "Tahun" + "| " + "Biaya Sewa Perjam");
            BarangRental tmp = head;
            while (tmp != null){
                System.out.println("| " + tmp.noTNKB + "| " + tmp.namaKendaraan + "| " + tmp.jenisKendaraan + "| " + tmp.tahun + "| " + tmp.biayaSewa);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        }

        BarangRental current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if(isEmpty() || index >= size){
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            BarangRental current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    
}


