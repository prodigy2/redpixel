import java.util.ArrayList;
import java.util.List;

public class SequenzaEffetti {

    private static final List<Effetto> generiMusicali = new ArrayList<>();

    static {
        // Aggiungi effetti per ogni genere musicale
        generiMusicali.add(new Effetto("Rock", new String[]{"Compressore", "Wah", "Overdrive", "Chorus", "Delay", "Reverb"}));
        generiMusicali.add(new Effetto("Metal", new String[]{"Wah", "Distorsore", "Delay", "Reverb"}));
        generiMusicali.add(new Effetto("Blues", new String[]{"Overdrive", "Chorus", "Reverb"}));
        generiMusicali.add(new Effetto("Funk", new String[]{"Wah", "Fuzz", "Chorus", "Flanger", "Phaser"}));
        generiMusicali.add(new Effetto("Ambient", new String[]{"Delay", "Reverb", "Flanger", "Uni-Vibe"}));
    }

    public static void main(String[] args) {
        String genere = "Rock"; // Sostituisci con il genere desiderato

        Effetto effettoGenere = generiMusicali.stream()
                .filter(e -> e.getNome().equals(genere))
                .findFirst()
                .orElse(null);

        if (effettoGenere != null) {
            System.out.println("Sequenza effetti consigliata per " + genere + ":");
            for (String effettoNome : effettoGenere.getEffetti()) {
                System.out.println("- " + effettoNome);
            }
        } else {
            System.out.println("Genere musicale non trovato: " + genere);
        }
    }

    private static class Effetto {
        private final String nome;
        private final String[] effetti;

        public Effetto(String nome, String[] effetti) {
            this.nome = nome;
            this.effetti = effetti;
        }

        public String getNome() {
            return nome;
        }

        public String[] getEffetti() {
            return effetti;
        }
    }
}
