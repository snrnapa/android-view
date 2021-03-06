package com.example.listviewforjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private static final String[] texts = {
            // DP14の楽曲リストより

            "50th Memorial Songs -Beginning Story-(激) (562d)",
            "8000000(激) (50d)",
            "ACROSS WORLD(鬼) (527d)",
            "AFRONOVA(X-Special)(鬼) (955d)",
            "Arrabbiata(踊) (149d)",
            "Avenger(踊) (43d)",
            "Be a Hero!(踊) (998d)",
            "BITTER CHOCOLATE STRIKER(激) (119d)",
            "Boss Rush(踊) (44d)",
            "Bounce Trippy(激) (383d)",
            "CAPTAIN JACK (GRANDALE REMIX)(激) (1305d)",
            "Catch Our Fire!(踊) (632d)",
            "CHAOS(激) (901d)",
            "Chronos (walk with you remix)(激) (623d)",
            "Come Back To Me(激) (12d)",
            "Confession(鬼) (1036d)",
            "CONNECT-(激) (114d)",
            "CROSS(激) (248d)",
            "Cytokinesis(激) (556d)",
            "Daily Lunch Special(激) (1241d)",
            "Dead Heat(激) (527d)",
            "Determination(激) (527d)",
            "Diamond Night(鬼) (556d)",
            "Dispersion Star(激) (747d)",
            "DoLL(鬼) (1870d)",
            "Draw the Savage(激) (123d)",
            "EGOISM 440(踊) (517d)",
            "Electric Dance System Music(激) (780d)",
            "Elemental Creation(踊) (136d)",
            "Empathetic(激) (830d)",
            "escape(鬼) (993d)",
            "Evans(踊) (70d)",
            "F4SH10N(激) (660d)",
            "Flow (True Style)(鬼) (194d)",
            "FUNKY SUMMER BEACH(激) (790d)",
            "GHOST KINGDOM(激) (117d)",
            "GUILTY DIAMONDS(激) (248d)",
            "Healing Vision(Angelic Mix)(激) (143d)",
            "HEART BEAT FORMULA (Vinyl Mix)(激) (1112d)",
            "Hella Deep(激) (78d)",
            "Horatio(激) (279d)",
            "Horatio(鬼) (1848d)",
            "HYENA(激) (1054d)",
            "Illegal Function Call(踊) (686d)",
            "IMANOGUILTS(激) (169d)",
            "IRON HEART(激) (625d)",
            "Ishtar(激) (1616d)",
            "IX(踊) (527d)",
            "JOKER(鬼) (1321d)",
            "Jucunda Memoria(踊) (91d)",
            "KEEP ON MOVIN' (Y&Co. DJ BOSS remix)(激) (871d)",
            "La libertad(鬼) (130d)",
            "Lachryma《Re",
            "London EVOLVED (ver.A)(激) (1978d)",
            "London EVOLVED (ver.B)(激) (334d)",
            "London EVOLVED (ver.C)(激) (1978d)",
            "Love♡Shine わんだふるmix(鬼) (215d)",
            "Midnight Amaretto(激) (74d)",
            "NEPHILIM DELTA(激) (1240d)",
            "Neverland(激) (648d)",
            "New Century(踊) (255d)",
            "New Decade(踊) (169d)",
            "New Generation(激) (547d)",
            "New Gravity(鬼) (214d)",
            "nightbird lost wing(激) (651d)",
            "No Life Queen [DJ Command Remix](激) (369d)",
            "on the bounce(激) (126d)",
            "On The Break(激) (2035d)",
            "ONYX(激) (74d)",
            "ORCA(踊) (34d)",
            "output.text",
            "PARANOiA MAX～DIRTY MIX～(X-Special)(鬼) (532d)",
            "PARANOiA Rebirth(X-Special)(鬼) (550d)",
            "PARANOiA Revolution(踊) (169d)",
            "PARANOiA(X-Special)(鬼) (175d)",
            "Pierce The Sky(激) (1248d)",
            "Plan 8(激) (1574d)",
            "Pluto Relinquish(踊) (130d)",
            "Pluto(激) (173d)",
            "POSSESSION(踊) (84d)",
            "PRANA(激) (2134d)",
            "printemps(激) (528d)",
            "PUNISHER(激) (552d)",
            "Pursuer(踊) (873d)",
            "Reach The Sky, Without you(踊) (41d)",
            "Realize(激) (73d)",
            "Right on time (Ryu☆Remix)(激) (527d)",
            "Romancing Layer(激) (508d)",
            "RËVOLUTIФN(激) (73d)",
            "SABER WING (satellite silhouette remix)(鬼) (513d)",
            "Sakura Mirage(激) (290d)",
            "Sakura Reflection(激) (1000d)",
            "sakura storm(鬼) (885d)",
            "Second Heaven(鬼) (1501d)",
            "second spring storm(激) (6d)",
            "Shiny World(激) (1040d)",
            "Show me your moves(鬼) (750d)",
            "siberite(激) (343d)",
            "Silly Love(激) (542d)",
            "Sparkle Smilin'(激) (105d)",
            "Starlight Fantasia(激) (134d)",
            "Starlight in the Snow(激) (618d)",
            "starmine(激) (189d)",
            "Stella Sinistra(激) (1562d)",
            "STEP MACHINE(激) (103d)",
            "STERLING SILVER (U1 overground mix)(激) (1212d)",
            "Straight Oath(激) (914d)",
            "Summer Fairytale(鬼) (460d)",
            "Synergy For Angels(激) (913d)",
            "Tell me what to do(鬼) (610d)",
            "The History of the Future(踊) (645d)",
            "The Least 100sec(激) (186d)",
            "The Wind of Gold(激) (460d)",
            "Tohoku EVOLVED(踊) (528d)",
            "Top The Charts(鬼) (1544d)",
            "Tribe(鬼) (445d)",
            "TRIP MACHINE CLIMAX(X-Special)(鬼) (997d)",
            "Triple Counter(踊) (879d)",
            "Uh-Oh(激) (74d)",
            "Unreal(激) (436d)",
            "Valkyrie dimension(踊) (359d)",
            "VEGA(激) (168d)",
            "Xmix1 (Midnight Dawn)(激) (2406d)",
            "Yuni's Nocturnal Days(激) (128d)",
            "ZETA～素数の世界と超越者～(激) (531d)",
            "ÆTHER(踊) (638d)",
            "Übertreffen(激) (81d)",
            "ΔMAX(踊) (31d)",
            "ありふれたせかいせいふく(激) (11d)",
            "この子の七つのお祝いに(激) (133d)",
            "ちくわパフェだよ☆CKP(鬼) (1391d)",
            "ようこそジャパリパークへ(激) (392d)",
            "ウッーウッーウマウマ(ﾟ∀ﾟ)(Speedcake Remix)(鬼) (1227d)",
            "スーパー戦湯ババンバーン(激) (125d)",
            "セツナトリップ(激) (130d)",
            "ドキドキ☆流星トラップガール!!(激) (648d)",
            "ノルエピネフリン(激) (105d)",
            "ミッドナイト☆WAR(激) (220d)",
            "モノクロモーメント(激) (22m)",
            "ヤマトなでなで♡かぐや姫(鬼) (1310d)",
            "ラブキラ☆スプラッシュ(激) (7d)",
            "ロールプレイングゲーム(激) (448d)",
            "不沈艦CANDY(激) (1889d)",
            "世界の果てに約束の凱歌を -DDR Extended Megamix-(踊) (108d)",
            "初音ミクの消失(激) (909d)",
            "創世ノート(激) (831d)",
            "勇猛無比(激) (48d)",
            "大見解(鬼) (505d)",
            "彼方のリフレシア(激) (113d)",
            "恋はどう？モロ◎波動OK☆方程式！！(激) (225d)",
            "春風ブローインウィンド(激) (638d)",
            "朧(鬼) (510d)",
            "梅雪夜(激) (128d)",
            "突撃!ガラスのニーソ姫!(激) (528d)",
            "脳漿炸裂ガール(鬼) (955d)",
            "野球の遊び方　そしてその歴史　～決定版～(激) (148d)",
            "鋳鉄の檻(激) (121d)",
            "革命(X-Special)(鬼) (173d)",
            "黒髪乱れし修羅となりて～凛 edition～(激) (808d)",

    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ListViewに表示するリスト項目をArrayListで準備する
        ListView listView = new ListView(this);
        setContentView(listView);

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<>(this, R.layout.list, texts);
        listView.setAdapter(arrayAdapter);
    }
}