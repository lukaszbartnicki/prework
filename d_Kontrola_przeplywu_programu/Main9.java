public class Main9 {

        public static void main(String[] args) {
            //definicja zmiennej z liczbą rzędów i gwiazdek w wierszu
            int n = 10;

            //tworzymy pętlę która będzie generowała nam WIERSZE
            for (int i = 1; i <= n; i++) {
                String row = "";//zmienna która jest zerowana na początku każdej iteracji, przechowująca gwiazdki z wiersza

                //tworzymy pętlę generującą nam gwiazdki w wierszu
                for (int j = 1; j <= n; j++) {
                	if(i>=j){
				row += "* ";
               		}else{
				row += j + " ";
			}
		}
                System.out.println(row);//wyświetlamy gwiazdki z wiersza i dodajemy znak nowej lini
            }
        }

}
