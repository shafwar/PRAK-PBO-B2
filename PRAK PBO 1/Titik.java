 public class Titik {
        /*ATRIBUT */
        double absis;
        double ordinat;
        static int counterTitik = 0;

        /*METHOD */
        //menampilkan nilai counterTitik
        void printCounterTitik() {
            System.out.println(this.counterTitik);
        }

        //konstruktor untuk membuat titik (x,y)
        Titik(double absis, double ordinat) {
            this.absis = absis;
            this.ordinat = ordinat;
            counterTitik++;
        }

        //konstruktor untuk membuat titik (0,0)
        Titik() {
            /* this.absis = 0;
            this.ordinat = 0;
            counterTitik++;
            */
            this(0,0);
        }

        //mengembalikan nilai counterTitik
        static int getCounterTitik(){
            return counterTitik;
        }

        //mengembalikan nilai absis
        double getAbsis() {
            return this.absis;
        }

        //mengembalikan nilai ordinat
        double getOrdinat() {
            return this.ordinat;
        }

        //mengeset absis titik dengan nilai baru x
        void setAbsis(double x) {
            this.absis = x;
        }

        //mengeset ordinat titik dengan nilai baru y
        void setOrdinat(double y) {
            this.ordinat = y;
        }

        //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
        void  geser(double x, double y) {
            this.absis = this.absis + x;
            this.ordinat = this.ordinat + y;
        }

        //mengembalikan nilai kuadran titik
        int getKuadran() {
            if (this.absis > 0 && this.ordinat > 0) {
                return 1;
            } else if (this.absis < 0 && this.ordinat > 0) {
                return 2;
            } else if (this.absis < 0 && this.ordinat < 0) {
                return 3;
            } else if (this.absis > 0 && this.ordinat < 0) {
                return 4;
            } else {
                return 0;
            }
        }

        //mengembalikan nilai jarak titik ke pusat(0,0)
        double getJarakPusat() {
            return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
        }

        //mengembalikan nilai jarak antara titik akar(((absis-absis)^2) + ((ordinat-ordinat)^2))
        double getJarak(Titik T){
            return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
        }

        //merefleksikan Titik terhadap x(mengubah ordinat)
        void setRefelksiX() {
            this.ordinat = this.ordinat * (-1);
        }

        //merefleksikan Titik terhadap y(mengubah absis)
        void setRefelksiY() {
            this.absis = this.absis * (-1);
        }

        //mengembalikan Titik baru yang sudah direfleksikan terhadap x
        Titik getRefleksiX() {
            /* T = new Titik();
            T.setOrdinat((ordinat*(-1)));
            T.setAbsis(absis);
            return T;
            */

            return new Titik(this.absis, -this.ordinat);
        }

        //mengembalikan Titik baru yang sudah direfleksikan terhadap x
        Titik getRefleksiY() {
            /* T = new Titik();
            T.setAbsis(absis*(-1));
            T.setOrdinat(ordinat);
            return T;
            */

            return new Titik(-this.absis, this.ordinat);
        }

        @Override
        public String toString() {
            return "(" + absis + ", " + ordinat + ")";
        }

        //mencetak koordinat titik
        void printTitik() {
            System.out.println("Titik (" + this.absis + "," + this.ordinat + ")");
        }
 } //end class Titik
