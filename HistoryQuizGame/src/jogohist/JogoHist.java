package jogohist;

import javax.swing.JOptionPane;

public class JogoHist {


    public static void main(String[] args) {

        int Acertos = 0, Acertos1 = 0, Acertos2 = 0;
        int erro = 0;
        String qerrada = new String();


        JOptionPane.showMessageDialog(null, "Bem-vindos ao Quiz de história, aperte OK para continuar!");
        String nome = JOptionPane.showInputDialog("Digite Seu nome:");
        String pront = JOptionPane.showInputDialog("Insira o prontuario:");
        JOptionPane.showMessageDialog(null, "o seu nome é: " + nome + " e o prontuario: " + pront);

        while (Acertos < 15) {
            for (Acertos = 0; Acertos <= 20; ) {
                erro = 0;
                {
                    JOptionPane.showMessageDialog(null, "Nível Fácil!");
                    //pergunta 1
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n1. (Enem 2014) Três décadas – de 1884 a 1914 – separam o século XIX – que terminou com a corrida "
                            + "\n dos países europeus para a África e com o surgimento dos movimentos de unificação nacional na Europa – do século XX, que "
                            + "\n começou com a Primeira Guerra Mundial. "
                            + "\n É o período do Imperialismo, da quietude estagnante na Europa e dos acontecimentos "
                            + "empolgantes na Ásia e na África.\n" +
                            "ARENDT, H. As origens do totalitarismo. São Paulo Cia. das Letras, 2012.\n" +
                            "O processo histórico citado contribuiu para a eclosão da Primeira Grande Guerra na medida em que\n\n" +
                            "a) difundiu as teorias socialistas.\n" +
                            "b) acirrou as disputas territoriais.\n" +
                            "c) superou as crises econômicas.\n" +
                            "d) multiplicou os conflitos religiosos.\n" +
                            "e) conteve os sentimentos xenófobos.");
                    String resposta1 = JOptionPane.showInputDialog("insira a resposta");
                    char R = resposta1.charAt(0);
                    if (R == 'B' || R == 'b') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 1;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }

                    //pergunta 2
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n 2. (Mackenzie) A respeito do envolvimento dos E.U.A. na Primeira Grande Guerra é INCORRETO afirmar que:\n\n" +
                            "a) foi influenciado pela intenção germânica de atrair o México, prometendo-lhe ajuda na reconquista de territórios perdidos para os E.U.A.\n" +
                            "b) os E.U.A. financiaram diretamente a indústria bélica franco-inglesa e enviaram um grande contingente de soldados à fronte.\n" +
                            "c) uma possível derrota da França e Inglaterra colocaria em risco os investimentos norte-americanos na Europa.\n" +
                            "d) contrariando o Congresso, o presidente dos E.U.A. rompeu a neutralidade, declarando guerra às forças do Eixo.\n" +
                            "e) a adesão dos E.U.A. desequilibrou as forças em luta, dando um novo alento à Entente.");
                    String resposta2 = JOptionPane.showInputDialog("insira a resposta");
                    char R2 = resposta2.charAt(0);
                    if (R2 == 'D' || R2 == 'd') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 2;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //pergunta 3
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n3. (Mackenzie) Ao término da Primeira Grande Guerra, as potências vencedoras responsabilizaram a \n "
                            + "Alemanha pela guerra e foi-lhe imposto um tratado punitivo, o Tratado de Versalhes, que teve como consequências:\n" +
                            "a) degradação dos ideais liberais e democráticos, agitações políticas de esquerda - como o movimento espartaquista - crise econômica e desemprego.\n" +
                            "b) enfraquecimento dos sentimentos nacionais, militarização do Estado Alemão, recuperação econômica e incorporação de Gdansk.\n" +
                            "c) anexação das colônias de Togo e Camarões, a afirmação dos ideais liberais e democráticos e a valorização do marco alemão.\n" +
                            "d) prosperidade econômica, rearmamento alemão, desmembramento da Alemanha e fortalecimento dos partidos liberais.");
                    String resposta3 = JOptionPane.showInputDialog("insira a resposta");
                    char R3 = resposta3.charAt(0);
                    if (R3 == 'A' || R3 == 'a') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 3;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //pergunta4
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n4. (Mackenzie) Dentre as causas da Primeira Grande Guerra, \n "
                            + "destaca-se a questão balcânica, que pode ser associada:\n" +
                            "a) à formação de novas nacionalidades, como a Iugoslava sob a tutela da Alemanha.\n" +
                            "b) às disputas coloniais na Ásia e na África entre a França e a Inglaterra.\n" +
                            "c) ao interesse russo em abrir os estreitos de Bósforo e Dardanelos, o nacionalismo eslavo e ao temor austríaco quanto à formação da Grande Sérvia.\n" +
                            "d) às desavenças entre o Império Austro-Húngaro e a Inglaterra ligadas à anexação da Bósnia-Herzegovina.\n" +
                            "e) ao assassinato do Príncipe Herdeiro, Francisco Ferdinando, e as questões pendentes relacionadas ao Tratado de Brest-Litowsky e o desmembramento da Áustria-Hungria.");
                    String resposta4 = JOptionPane.showInputDialog("insira a resposta");
                    char R4 = resposta4.charAt(0);
                    if (R4 == 'C' || R4 == 'c') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 4;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //pergunta5
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n5. (Unirio) Dentre os fatores que conduziram à Primeira Guerra Mundial (1914-1918), destacamos o (a):\n" +
                            "a) nacionalismo eslavo aliado à desagregação do Império Turco.\n" +
                            "b) acordo militar anglo-germânico visando à partilha da África.\n" +
                            "c) desequilíbrio internacional provocado pela aliança da Rússia com o Império Austro-Húngaro.\n" +
                            "d) descontentamento da França frente à ocupação no Marrocos.\n" +
                            "e) oposição do Imperador Francisco Ferdinando à admissão da Sérvia no Império Austro-Húngaro.");
                    String resposta5 = JOptionPane.showInputDialog("insira a resposta");
                    char R5 = resposta5.charAt(0);
                    if (R5 == 'A' || R5 == 'a') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 5;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //pergunta6
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n6. (Fuvest) O Plano Marshall, aplicado pelo governo norte-americano após a Segunda Guerra Mundial, visava à: \n" +
                            "a) ratificação do Tratado do Atlântico Norte. \n" +
                            "b) preservação da paz mundial com a formação da Organização das Nações Unidas (ONU). \n" +
                            "c) concessão de apoio político e econômico aos países do Terceiro Mundo. \n" +
                            "d) recuperação econômica da Europa para neutralizar o expansionismo soviético. \n" +
                            "e) formulação de princípios que impediam a intervenção dos EUA nas questões internacionais.");
                    String resposta6 = JOptionPane.showInputDialog("insira a resposta");
                    char R6 = resposta6.charAt(0);
                    if (R6 == 'D' || R6 == 'd') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 6;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //pergunta7
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n7. (Fuvest-gv) \"Esta guerra, de fato, é uma continuação da anterior.\" \n" +
                            "                                          (Winston Churchill, em discurso feito no Parlamento em 21 de agosto de 1941). \n" +
                            "\n" +
                            "A afirmativa acima confirma a continuidade latente de problemas não solucionados na Primeira Guerra Mundial que contribuíram para \n "
                            + "alimentar os antagonismos e levaram à eclosão da Segunda Guerra Mundial. Entre esses problemas identificamos: \n" +
                            "a) crescente nacionalismo econômico, aumento da disputa por mercados consumidores e por áreas de investimentos. \n" +
                            "b) desenvolvimento do imperialismo chinês na Ásia, com abertura para o Ocidente. \n" +
                            "c) os antagonismos austro-ingleses que giraram em torno da questão Alsácia-Lorena. \n" +
                            "d) oposição ideológica que fragilizou os vínculos entre os países, enfraquecendo todo tipo de nacionalismo. \n" +
                            "e) a divisão da Alemanha que levou a uma política agressiva de expansão marítima. ");
                    String resposta7 = JOptionPane.showInputDialog("insira a resposta");
                    char R7 = resposta7.charAt(0);
                    if (R7 == 'A' || R7 == 'a') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 7;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //pergunta8
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n8. (Unicamp 2014) Em 1942, os estúdios Disney produziram o desenho “Alô Amigos”, \n"
                            + "que apresenta a personagem Zé Carioca. Dois anos depois surgiu uma nova animação: The Three Caballeros, conhecida \n"
                            + "no Brasil como “Você já foi à Bahia? ”. Nos desenhos citados, o Brasil e a América Latina são mostrados de forma simpática, \n"
                            + "através de estereótipos. Para entender esses desenhos e o esforço de Walt Disney, devemos considerar o seguinte contexto:\n" +
                            "a) a Segunda Guerra Mundial e a política de boa vizinhança.   \n" +
                            "b) o avanço da Guerra Fria e o episódio da Crise dos Mísseis de Cuba.   \n" +
                            "c) a política do “Big Stick” e os resultados da diplomacia do dólar.   \n" +
                            "d) o avanço do populismo e a tentativa de Truman de barrar esta influência.");
                    String resposta8 = JOptionPane.showInputDialog("insira a resposta");
                    char R8 = resposta8.charAt(0);
                    if (R8 == 'A' || R8 == 'a') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 8;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //pergunta9
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n9. (Mackenzie) A batalha que aconteceu em Stalingrado, durante a II Guerra Mundial, marcou: \n" +
                            "a) a consolidação das posições alemãs na Rússia, decorrente da expansão fulminante das potências do Eixo (Itália-Alemanha-Japão). \n" +
                            "b) a neutralização do exército de Stálin, obrigando-o a assinar o Pacto Germano-Soviético de não agressão e neutralidade. \n" +
                            "c) a inversão da situação militar da II Guerra, dando início ao recuo nazista na Europa Oriental e à decadência do Terceiro Reich. \n" +
                            "d) a vitória da Blitzkrieg - guerra relâmpago que consistia em ataques maciços, com o uso de carros blindados, aviões e navios. \n" +
                            "e) o desembarque aliado nas praias da Normandia - o Dia D, que conteve a ofensiva alemã, destruindo pela primeira vez o mito da invencibilidade da Wehrmacht. ");
                    String resposta9 = JOptionPane.showInputDialog("insira a resposta");
                    char R9 = resposta9.charAt(0);
                    if (R9 == 'C' || R9 == 'c') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 9;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //pergunta10
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n10. (Fatec) \"É lógico que os EUA devem fazer o que lhes for possível para ajudar a promover o retorno\n"
                            + " ao poder econômico normal do mundo, sem o que não pode haver estabilidade política nem garantia de Paz.\" \n" +
                            "(Plano Marshall - 5.VI.1947) \n" +
                            "\n" +
                            "O Plano Marshall se constituiu \n" +
                            "a) na principal meta da política externa norte-americana, que era pacificar o Extremo Oriente. \n" +
                            "b) num projeto de ajuda industrial aos países da América Latina. \n" +
                            "c) num importante instrumento de expansão do comunismo na Europa. \n" +
                            "d) na definição da política externa isolacionista dos EUA, paralela à montagem do complexo industrial militar. \n" +
                            "e) num dos meios de penetração dos capitais norte-americanos nas economias europeias. ");
                    String resposta10 = JOptionPane.showInputDialog("insira a resposta");
                    char R10 = resposta10.charAt(0);
                    if (R10 == 'E' || R10 == 'e') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 10;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    // 11
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n11. (Unicamp 2011) Para muitos norte-americanos, Vietnã é o nome de uma guerra, não de um país.\n"
                            + " Os vietnamitas parecem figuras sombrias, sem nome nem rosto, vítimas desamparadas ou agressores cruéis. A história\n"
                            + " começa apenas quando os Estados Unidos entram em cena.\n" +
                            "(Adaptado de Marvin E. Gettleman et. alli (Ed.), Vietnam and America: a documented history. New York: Grove Press, 1995, p. xiii.)\n" +
                            "  \n" +
                            "Esse desconhecimento dos norte-americanos quanto a seus adversários na Guerra do Vietnã pode ser relacionado ao fato de os norte-americanos\n" +
                            "a) promoverem uma guerra de trincheiras, enquanto os vietnamitas comunistas movimentavam seus batalhões pela selva. Contando com um forte\n"
                            + " apoio popular, os Estados Unidos permaneceram por anos nesse conflito, mas não conseguiram derrotar os vietnamitas.\n" +
                            "b) invadirem e ocuparem o território vietnamita, desmantelando os batalhões comunistas graças à superioridade americana em treinamento militar \n"
                            + "e armamentos. Apesar do apoio popular à guerra, os Estados Unidos desocuparam o território vietnamita.\n" +
                            "c) desconhecerem as tradições dos vietnamitas, organizados em torno de líderes tribais, que eram os chefes militares de seus clãs. Sem \n "
                            + "ter um Estado como adversário, o conflito se arrastou e, sem apoio popular, os Estados Unidos acabaram se retirando.\n" +
                            "d) encontrarem grande dificuldade em enfrentar as táticas de guerrilha dos vietnamitas comunistas, que tinham maior conhecimento territorial.\n"
                            + " Após várias derrotas e sem apoio popular em seu próprio país, os Estados Unidos retiraram suas tropas do Vietnã.");
                    String resposta11 = JOptionPane.showInputDialog("insira a resposta");
                    char R11 = resposta11.charAt(0);
                    if (R11 == 'D' || R11 == 'd') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 11;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //12
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n12. (Puccamp) \"...inspirado por razões humanitárias e pela vontade de defender uma certa\n"
                            + " concepção de vida ameaçada pelo comunismo, constitui também o meio mais eficaz de alargar e consolidar a influência\n"
                            + " norte-americana no mundo, um dos maiores instrumentos de sua expansão (...) tem por consequência imediata consolidar \n"
                            + "os dois blocos e aprofundar o abismo que separava o mundo comunista e o Ocidente...\"\n" +
                            "\n" +
                            "\n" +
                            "\"...as partes estão de acordo em que um ataque armado contra uma ou mais delas na Europa ou na América do Norte deve ser considerado uma agressão \n "
                            + "contra todas; e, consequentemente, concordam que, se tal agressão ocorrer, cada uma delas (...) auxiliará a parte ou as partes \n"
                            + "assim agredidas (...)\"\n" +
                            "\n" +
                            "\n" +
                            "Os textos identificam, respectivamente,\n" +
                            "a) a Doutrina Monroe e a Organização da Nações Unidas (ONU).\n" +
                            "b) o Plano Marshall e a organização do Tratado do Atlântico Norte (OTAN).\n" +
                            "c) o Pacto de Varsóvia e a Comunidade Econômica Européia (CEE).\n" +
                            "d) o Pacto do Rio de Janeiro e o Conselho de Assistência Econômica Mútua (COMECON).\n" +
                            "e) a Conferência do Cairo e a Organização dos Estados Americanos (OEA).");
                    String resposta12 = JOptionPane.showInputDialog("insira a resposta");
                    char R12 = resposta12.charAt(0);
                    if (R12 == 'B' || R12 == 'b') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 12;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //13
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n13. (Puccamp) \"A bipolarização do mundo, após a Segunda Guerra Mundial, apesar de ter se constituído \n"
                            + "na principal referência para as relações internacionais, não chegou a garantir um verdadeiro equilíbrio mundial. Nesse contexto\n"
                            + " consolidou-se a hegemonia   internacional norte-americana\".  A esse respeito pode-se afirmar que na presidência de\n" +
                            "a) Truman (1945 - 52), encerrou-se a política macarthista, o que possibilitou o fim da Guerra da Coréia e sua consequente unificação sob um protetorado\n"
                            + " norte-americano.\n" +
                            "b) Eisenhower (1952 - 60), completou-se o sistema de segurança norte-americano, com a formação de diversos pactos militares contra os comunistas.\n" +
                            "c) Kennedy (1960 - 63), desenvolvendo a \"Aliança para o Progresso\" encerrou-se a política de confronto com o mundo comunista, permitindo a retirada\n"
                            + " americana do conflito vietnamita.\n" +
                            "d) Johnson (1963 - 68), a discussão da Doutrina Monroe consolidou-se as alianças políticas com os movimentos nacionalistas e o fim das intervenções\n"
                            + " militares na América Latina.\n" +
                            "e) Nixon (1968 - 1974), a aproximação com os países comunistas foi dificultada pela negação da União Soviética em assinar o Tratado de Limitação\n"
                            + " de Armas Estratégicas, Salt-1.");
                    String resposta13 = JOptionPane.showInputDialog("insira a resposta");
                    char R13 = resposta13.charAt(0);
                    if (R13 == 'B' || R13 == 'b') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 13;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //14
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n14. (Enem) Em dezembro de 1998, um dos assuntos mais veiculados nos jornais era o que tratava \n"
                            + "da moeda única européia. Leia a notícia destacada a seguir.\n" +
                            "\n" +
                            "O nascimento do Euro, a moeda única a ser adotada por onze países europeus a partir de 1 de janeiro, é possivelmente a mais importante realização\n"
                            + " deste continente nos últimos dez anos que assistiu à derrubada do Muro de Berlim, à reunificação das Alemanha, à libertação\n"
                            + " dos países da Cortina de Ferro e ao fim da União Soviética. Enquanto todos esses eventos têm a ver com a desmontagem de estruturas \n"
                            + " do passado, o Euro é uma ousada aposta no futuro e uma prova da vitalidade da sociedade europeia. A \"Euroland\", região \n"
                            + "abrangida por Alemanha, Áustria, Bélgica, Espanha, Finlândia, França, Holanda, Irlanda, Itália, Luxemburgo e Portugal, tem um PIB \n"
                            + "(Produto Interno Bruto) equivalente a quase 80% do americano, 289 milhões de consumidores e responde por cerca de 20% do comércio \n"
                            + "internacional. Com este cacife, o Euro vai disputar com o dólar a condição de moeda hegemônica.\n" +
                            "                (Gazeta Mercantil, 30/12/1998)\n" +
                            "\n" +
                            "A matéria refere-se 'a \" desmontagem das estruturas do passado” que pode ser entendida como\n" +
                            "a) o fim da Guerra Fria, período de inquietação mundial que dividiu o mundo em dois blocos ideológicos opostos.\n" +
                            "b) a inserção de alguns países do Leste Europeu em organismos supranacionais, com o intuito de exercer o controle ideológico no mundo.\n" +
                            "c) a crise do capitalismo, do liberalismo e da democracia levando à polarização ideológica da antiga URSS.\n" +
                            "d) a confrontação dos modelos socialistas e capitalista para deter o processo de unificação das duas Alemanhas.\n" +
                            "e) a prosperidade as economias capitalistas e socialistas, com o consequente fim da Guerra Fria entre EUA e a URSS.");
                    String resposta14 = JOptionPane.showInputDialog("insira a resposta");
                    char R14 = resposta14.charAt(0);
                    if (R14 == 'A' || R14 == 'a') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 14;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //15
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n15. Os 45 anos que vão do lançamento das bombas atômicas até o fim da União Soviética,\n"
                            + " não foram um período homogêneo único na história do mundo. (...) dividem-se em duas metades, tendo como divisor de\n"
                            + " águas o início da década de 70. Apesar disso, a história deste período foi reunida sob um padrão único pela situação \n"
                            + "internacional peculiar que o dominou até a queda da URSS. (HOBSBAWM, Eric J. Era dos Extremos. São Paulo: Cia das Letras,1996). \n"
                            + "O período citado no texto e conhecido por “Guerra Fria” pode ser definido como aquele momento histórico em que houve:\n" +
                            "a) corrida armamentista entre as potências imperialistas europeias ocasionando a Primeira Guerra Mundial.\n" +
                            "b) domínio dos países socialistas do Sul do globo pelos países capitalistas do Norte.\n" +
                            "c) choque ideológico entre a Alemanha Nazista / União Soviética Stalinista, durante os anos 30.\n" +
                            "d) disputa pela supremacia da economia mundial entre o Ocidente e as potências orientais, como a China e o Japão.\n" +
                            "e) constante confronto das duas superpotências que emergiram da Segunda Guerra Mundial.");
                    String resposta15 = JOptionPane.showInputDialog("insira a resposta");
                    char R15 = resposta15.charAt(0);
                    if (R15 == 'A' || R15 == 'a') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 15;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //16
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n16.A campanha militar empreendida para exterminar o arraial de Canudos contou com a\n"
                            + " participação de um célebre escritor que, a partir do que viu, escreveu uma das obras clássicas da literatura\n"
                            + " brasileira. Indique a alternativa que aponta corretamente o nome do escritor e a obra produzida.\n" +
                            "a.	Euclides da Cunha – Os Sertões.\n" +
                            "b.	Lima Barreto - Os bruzundangas.\n" +
                            "c.	Mário de Andrade – Macunaíma.\n" +
                            "d.	Castro Alves – Os Escravos.\n" +
                            "e.	Graciliano Ramos – Vidas Secas.");
                    String resposta16 = JOptionPane.showInputDialog("insira a resposta");
                    char R16 = resposta16.charAt(0);
                    if (R16 == 'A' || R16 == 'a') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 16;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //17
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n17.A comunidade de Canudos, formada na década final do século XIX, \n"
                            + "contestava a distribuição de terras no sertão nordestino e buscava, com a formação do arraial, \n"
                            + "tirar parte da população sertaneja da situação de miséria e abandono em que se encontrava. À frente\n"
                            + " da comunidade havia um líder religioso conhecido como:\n" +
                            "a.	Monge José Maria\n" +
                            "b.	João Maria\n" +
                            "c.	João Campos\n" +
                            "d.	Antônio Conselheiro\n" +
                            "e.	Antônio Milagreiro.");
                    String resposta17 = JOptionPane.showInputDialog("insira a resposta");
                    char R17 = resposta17.charAt(0);
                    if (R17 == 'D' || R17 == 'd') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 17;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //18
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n18.(Fuvest)\n" +
                            "Não é por acaso que as autoridades brasileiras recebem os aplausos unânimes das autoridades internacionais das grandes potências,\n"
                            + " pela energia implacável e eficaz de sua política saneadora [...]. O mesmo se dá com a repressão dos \n"
                            + "movimentos populares de Canudos e do Contestado, que, no contexto rural, [...] significam praticamente o\n"
                            + " mesmo que a Revolta da Vacina no contexto urbano.\n" +
                            "Nicolau Sevcenko. A Revolta da Vacina.\n" +
                            "De acordo com o texto, a Revolta da Vacina, o movimento de Canudos e o do Contestado foram vistos internacionalmente como:\n" +
                            "a.	Provocados pelo êxodo maciço de populações saídas do campo rumo às cidades logo após a abolição.\n" +
                            "b.	Retrógados, pois dificultavam a modernização do país.\n" +
                            "c.	Decorrentes da política sanitarista de Oswaldo Cruz.\n" +
                            "d.	Indícios de que a escravidão e o Império chegavam ao fim para dar lugar ao trabalho livre e à República.\n" +
                            "e.	Conservadores, porque ameaçavam o capital norte-americano no Brasil.");
                    String resposta18 = JOptionPane.showInputDialog("insira a resposta");
                    char R18 = resposta18.charAt(0);
                    if (R18 == 'B' || R18 == 'b') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 18;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //19
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n19.A Rebelião de Canudos foi fruto: \n" +
                            "a) Do fanatismo religioso de populares sem condições econômicas de subsistência; \n" +
                            "b) Do desejo de restaurar a monarquia portuguesa no Brasil;\n" +
                            "c) Da conspiração de grupos conservadores; \n" +
                            "d) Da organização de grupos de jagunços no sertão;\n" +
                            "e) n.d.a.");
                    String resposta19 = JOptionPane.showInputDialog("insira a resposta");
                    char R19 = resposta19.charAt(0);
                    if (R19 == 'A' || R19 == 'a') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 19;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    //20
                    JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n20.Sobre a Revolta de Canudos, assinale a alternativa INCORRETA. \n" +
                            "\n" +
                            "A) O seu principal líder foi Antônio Conselheiro. \n" +
                            "B) Os sertanejos de Canudos lutavam contra a injustiça e a miséria persistente na região. \n" +
                            "C) Caracterizou-se como um movimento de caráter messiânico. \n" +
                            "D) A Guerra de Canudos foi tema do livro “Os Sertões”, do escritor Euclides da Cunha. \n" +
                            "E) Os revoltosos de Canudos receberam apoio incondicional dos coronéis da região.");
                    String resposta20 = JOptionPane.showInputDialog("insira a resposta");
                    char R20 = resposta20.charAt(0);
                    if (R20 == 'E' || R20 == 'e') {
                        Acertos++;
                    } else {
                        erro++;
                        qerrada = qerrada + "Questão 20;";
                        if (erro > 5) {
                            break;
                        } else {
                        }
                    }
                    if (Acertos > 15) {
                        JOptionPane.showMessageDialog(null, "Parabéns " + nome + " por completar o Nível Fácil, aperte OK para ver sua pontuação \n"
                                + "lembrando que cada acerto equivale a um ponto");
                        JOptionPane.showMessageDialog(null, "Sua quantidade de acertos foi de: " + Acertos + "; E de erros foi: " + erro);
                        JOptionPane.showMessageDialog(null, "As questões que você errou foram: " + qerrada);
                        break;
                    }
                }
            }
            while (Acertos1 < 15) {
                for (Acertos1 = 0; Acertos1 <= 20; ) {
                    erro = 0;
                    Acertos = 0;
                    {
                        JOptionPane.showMessageDialog(null, "Nível Intermediário!");
                        //pergunta 1
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n1.Quando e por quem a escrita foi descoberta?\n"
                                + "a) 2000 a.C., Hebreus \n"
                                + "b) 200  d.C., Romanos \n"
                                + "c) 400  d.C., Nórdicos \n"
                                + "d) 4000 a.C., Sumérios \n"
                                + "e) 6000 a.C., Babilônios");
                        String resposta1 = JOptionPane.showInputDialog("insira a resposta");
                        char R = resposta1.charAt(0);
                        if (R == 'D' || R == 'd') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 1;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 2
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n2.Algumas casas de habitação dos reis tiveram grande efetividade política e \n"
                                + "terminaram por se transformar em patrimônio artístico e cultural, cujo exemplo é: \n"
                                + "A) o palácio de Versalhes. \n"
                                + "B) o Museu Britânico. \n"
                                + "C) a catedral de Colônia. \n"
                                + "D) a Casa Branca. \n"
                                + "E) a pirâmide do faraó Quéops.");
                        String resposta2 = JOptionPane.showInputDialog("insira a resposta");
                        char R2 = resposta2.charAt(0);
                        if (R2 == 'A' || R2 == 'a') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 2;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 3
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n3.A Idade Média é um extenso período da História do Ocidente cuja memória é construída e reconstruída segundo as circunstâncias das épocas posteriores.\n"
                                + " Assim, desde o Renascimento, esse período vem sendo alvo de diversas interpretações que dizem mais sobre o contexto histórico em que são \n"
                                + "produzidas do que propriamente sobre o Medievo. Um exemplo acerca do que está exposto no texto acima é: \n"
                                + "a) a associação que Hitler estabeleceu entre o III Reich e o Sacro Império Romano Germânico. \n"
                                + "b) o retorno dos valores cristãos medievais, presentes nos documentos do Concílio Vaticano II. \n"
                                + "c) a luta dos negros sul-africanos contra o apartheid inspirada por valores dos primeiros cristãos. \n"
                                + "d) o fortalecimento político de Napoleão Bonaparte, que se justificava na amplitude de poderes que tivera Carlos Magno. \n"
                                + "e) a tradição heroica da cavalaria medieval, que foi afetada negativamente pelas produções cinematográficas de Hollywood.");
                        String resposta3 = JOptionPane.showInputDialog("insira a resposta");
                        char R3 = resposta3.charAt(0);
                        if (R3 == 'A' || R3 == 'a') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 3;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 4
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n4.Do ponto de vista geopolítico, a Guerra Fria dividiu a Europa em dois blocos. \n"
                                + "Essa divisão propiciou a formação de alianças antagônicas de caráter militar, como a OTAN, que aglutinava os países do bloco \n"
                                + "ocidental, e o Pacto de Varsóvia, que concentrava os do bloco oriental. É importante destacar que, na formação da OTAN, estão presentes, \n"
                                + "além dos países do oeste europeu, os EUA e o Canadá. Essa divisão histórica atingiu igualmente os âmbitos político e econômico que se refletia pela \n"
                                + "opção entre os modelos capitalista e socialista. Essa divisão europeia ficou conhecida como: \n"
                                + "A) Cortina de Ferro. \n"
                                + "B) Muro de Berlim. \n"
                                + "C) União Europeia. \n"
                                + "D) Convenção de Ramsar. \n"
                                + "E) Conferência de Estocolmo.");
                        String resposta4 = JOptionPane.showInputDialog("insira a resposta");
                        char R4 = resposta4.charAt(0);
                        if (R4 == 'A' || R4 == 'a') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 4;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 5
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n5.Quando começa a Idade Média? \n"
                                + "a) 1005 d.C. \n"
                                + "b) 500 d.C. \n"
                                + "c) 476 d.C. \n"
                                + "d) 622 d.C. \n"
                                + "e) 325 d.C.");
                        String resposta5 = JOptionPane.showInputDialog("insira a resposta");
                        char R5 = resposta5.charAt(0);
                        if (R5 == 'C' || R5 == 'c') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 5;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 6
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n6.Qual o nome da mulher que fingiu ser homem para lutar na Guerra dos 100 anos? \n"
                                + "a) Elizabeth I \n"
                                + "b) Elizabeth II \n"
                                + "c) Maria de Nazaré \n"
                                + "d) Joana D’arc \n"
                                + "e) Princesa Isabel");
                        String resposta6 = JOptionPane.showInputDialog("insira a resposta");
                        char R6 = resposta6.charAt(0);
                        if (R6 == 'D' || R6 == 'd') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 6;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 7
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n7.Os primitivos habitantes do Brasil foram vítimas do processo colonizador. O europeu, com visão de mundo calcada em preconceitos, menosprezou o indígena e sua cultura. \n"
                                + "A acreditar nos viajantes e missionários, a partir de meados do século XVI, há um decréscimo da população indígena, que se agrava nos séculos seguintes. \n"
                                + "Os fatores que mais contribuíram para o citado \ndecréscimo foram:\n" +
                                "a) a captura e a venda do índio para o trabalho nas minas de prata do Potosí.\n" +
                                "b) as guerras permanentes entre as tribos indígenas e entre índios e brancos.\n" +
                                "c) o canibalismo, o sentido mítico das práticas rituais, o espírito sanguinário, cruel e vingativo dos naturais.\n" +
                                "d) as missões jesuíticas do vale amazônico e a exploração do trabalho indígena na extração da borracha.\n" +
                                "e) as epidemias introduzidas pelo invasor europeu e a escravidão dos índios. ");
                        String resposta7 = JOptionPane.showInputDialog("insira a resposta");
                        char R7 = resposta7.charAt(0);
                        if (R7 == 'E' || R7 == 'e') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 7;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 8
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n8.(UFMG) Todas as alternativas apresentam fatores que explicam a primazia dos portugueses no cenário dos grandes descobrimentos, exceto:\n" +
                                "a) a atuação empreendedora da burguesia lusa no desenvolvimento da indústria náutica.\n" +
                                "b) a localização geográfica de Portugal, distante do Mediterrâneo oriental e sem ligações comerciais com o restante do continente.\n" +
                                "c) a presença da fé e o espírito da cavalaria e das cruzadas que atribuíam aos portugueses a missão de cristianizar os povos chamados \"infiéis\".\n" +
                                "d) o aparecimento pioneiro da monarquia absolutista em Portugal responsável pela formação do Estado moderno.");
                        String resposta8 = JOptionPane.showInputDialog("insira a resposta");
                        char R8 = resposta8.charAt(0);
                        if (R8 == 'B' || R8 == 'b') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 8;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 9
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n9.(UEL-PR) No Brasil colônia, a pecuária teve um papel decisivo na:\n" +
                                "a) ocupação das áreas litorâneas\n" +
                                "b) expulsão do assalariado do campo\n" +
                                "c) formação e exploração dos minifúndios\n" +
                                "d) fixação do escravo na agricultura\n" +
                                "e) expansão para o interior ");
                        String resposta9 = JOptionPane.showInputDialog("insira a resposta");
                        char R9 = resposta9.charAt(0);
                        if (R9 == 'E' || R9 == 'e') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 9;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 10
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n10.Podemos afirmar sobre o período da mineração no Brasil que:\n" +
                                "a) atraídos pelo ouro, vieram para o Brasil aventureiros de toda espécie, que inviabilizaram a mineração.\n" +
                                "b) a exploração das minas de ouro só trouxe benefícios para Portugal.\n" +
                                "c) a mineração deu origem a uma classe média urbana que teve papel decisivo na independência do Brasil.\n" +
                                "d) o ouro beneficiou apenas a Inglaterra, que financiou sua exploração.\n" +
                                "e) a mineração contribuiu para interligar as várias regiões do Brasil e foi fator de diferenciação da sociedade. ");
                        String resposta10 = JOptionPane.showInputDialog("insira a resposta");
                        char R10 = resposta10.charAt(0);
                        if (R10 == 'E' || R10 == 'e') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 10;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 11
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n11.Leis britânicas acirraram as divergências entre colonos americanos e a Coroa inglesa, provocando a luta pela independência. Dentre os objetivos dessas leis, destacam-se:\n" +
                                "a) aumentar a receita real, impedir o contrabando e o comércio intercolonial e recuperar a Companhia das Índias Orientais.\n" +
                                "b) aumentar o consumo de chá e de açúcar na colônia, obrigar o uso de selos nas correspondências e aumentar as exportações da colônia.\n" +
                                "c) abolir a escravidão nas colônias, separar juridicamente as Treze Colônias e ajudar a Pensilvânia a anexar terras no Oeste.\n" +
                                "d) recuperar Companhia das Índias Ocidentais, abrir o porto de Boston às nações amigas e aumentar as importações da colônia.\n" +
                                "e) pagar indenizações à França, devido à derrota inglesa na Guerra dos Sete Anos, revogar os atos Townshend e favorecer os produtores locais de açúcar.");
                        String resposta11 = JOptionPane.showInputDialog("insira a resposta");
                        char R11 = resposta11.charAt(0);
                        if (R11 == 'A' || R11 == 'a') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 11;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 12
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n12.(Fuvest)Um comerciante está acostumado a empregar o seu dinheiro principalmente em projetos lucrativos, ao passo que um simples cavalheiro rural costuma empregar o seu em despesas.\n"
                                + " Um frequentemente vê seu dinheiro afastar-se e voltar às suas mãos com lucro; o outro, quando se separa do dinheiro, raramente espera vê-lo de novo. Esses hábitos diferentes afetam naturalmente os seus \n"
                                + "temperamentos e disposições em toda espécie de atividade. O comerciante é, em geral, um empreendedor audacioso; o cavalheiro rural, um tímido em seus empreendimentos...\" \n"
                                + "(Adam Smith, A RIQUEZA DAS NAÇÕES, Livro III, capítulo 4)\n" +
                                "Neste pequeno trecho, Adam Smith:\n" +
                                "a) contrapõe lucro à renda, pois geram racionalidades e modos de vida distintos.\n" +
                                "b) mostra as vantagens do capitalismo comercial em face da estagnação medieval.\n" +
                                "c) defende a lucratividade do comércio contra os baixos rendimentos do campo.\n" +
                                "d) critica a preocupação dos comerciantes com seus lucros e dos cavalheiros com a ostentação de riquezas.\n" +
                                "e) expõe as causas da estagnação da agricultura no final do século XVIII.");
                        String resposta12 = JOptionPane.showInputDialog("insira a resposta");
                        char R12 = resposta12.charAt(0);
                        if (R12 == 'A' || R12 == 'a') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 12;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 13
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n13.Após participar da conspiração que deu início à sua ascensão ao poder em 1799, Napoleão passou a dividir, \n"
                                + "provisoriamente, o poder central da França com mais duas pessoas até o ano de 1804. Esse período ficou conhecido como Consulado. \n"
                                + "Os outros dois cônsules que governaram junto a Napoleão foram:\n" +
                                "a) Maximilien Robespierre e Antoine de Saint-Just\n" +
                                "b) o abade Sieyès e Pierre-Roger Ducos\n" +
                                "c) o cardeal Richelieu e Danton\n" +
                                "d) Marat e Mirabeau\n" +
                                "e) Luís XVI e Guillaume Lellement");
                        String resposta13 = JOptionPane.showInputDialog("insira a resposta");
                        char R13 = resposta13.charAt(0);
                        if (R13 == 'C' || R13 == 'c') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 13;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 14
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n14.(Mackenzie) “[...] todo cruzamento de dois seres de valor desigual dá como produto um meio termo entre os valores dos pais [...] \n"
                                + "Tal ajuntamento está em contradição com a vontade da natureza, que tende a elevar o nível dos seres. Este objetivo não pode ser atingido pela união de indivíduos de \n"
                                + "valores diferentes, mas só pela vitória completa e definitiva dos que representam o mais alto valor. O papel do mais forte é o de dominar e não o de se fundir com o mais fraco, \n"
                                + "sacrificando assim sua própria grandeza.” (Adolf Hitler).\n" +
                                "No livro \"Mein Kampf\", Hitler expressava que:\n" +
                                "a) a necessidade de preservação da raça pura justificava o domínio e a eliminação das demais raças e a expansão da Alemanha.\n" +
                                "b) o racismo e o autoritarismo serviriam para defender a elevação da raça pura eslava e o extermínio dos judeus.\n" +
                                "c) o movimento nacional-socialista desaprovava o antissemitismo e o aperfeiçoamento genético por meio da eugenia.\n" +
                                "d) os alemães eram superiores e a raça ariana inferior, justificando, desse modo, o espaço vital.\n" +
                                "e) o mito da superioridade da raça ariana servia para que os nazistas estimulassem o internacionalismo e o liberalismo.");
                        String resposta14 = JOptionPane.showInputDialog("insira a resposta");
                        char R14 = resposta14.charAt(0);
                        if (R14 == 'A' || R14 == 'a') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 14;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 15
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n15.Em 1939, nas vésperas do desencadeamento da Segunda Guerra Mundial, Hitler protagonizou, \n"
                                + "junto a Josef Stalin, uma estratégia político-militar. Essa estratégia consistia:\n" +
                                "a) no ataque relâmpago a Londres e Paris.\n" +
                                "b) no bombardeamento de Tóquio.\n" +
                                "c) na concentração de forças contra o fascismo de Mussolini.\n" +
                                "d) no apoio ao ataque japonês à base militar americana de Pearl Harbor.\n" +
                                "e) no Pacto Germano-Soviético de não agressão.");
                        String resposta15 = JOptionPane.showInputDialog("insira a resposta");
                        char R15 = resposta15.charAt(0);
                        if (R15 == 'E' || R15 == 'e') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 15;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 16
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n16.Antes de entrar para o exército alemão e tornar-se combatente na Primeira Guerra Mundial, Hitler havia se mudado da sua cidade natal, Linz, na Áustria, \n"
                                + "para a capital desse país, Viena. O objetivo principal de Hitler, quando esteve em Viena, era:\n" +
                                "a)Levar a cabo suas ideias para a criação, em Viena, do primeiro núcleo do partido nazista.\n" +
                                "b)Estudar música clássica e tornar-se regente de orquestras.\n" +
                                "c) Estudar na Academia de Artes Plásticas de Viena e, por conseguinte, tornar-se um pintor reconhecido.\n" +
                                "d)Estudar economia com os representantes da Escola Austríaca de Economia.\n" +
                                "e)Estabelecer contato com os círculos psicanalíticos desenvolvidos em torno de Sigmund Freud.");
                        String resposta16 = JOptionPane.showInputDialog("insira a resposta");
                        char R16 = resposta16.charAt(0);
                        if (R16 == 'D' || R16 == 'd') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 16;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 17
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n17.O Estado Islâmico (EI), uma das organizações terroristas mais sanguinárias da atualidade, tem estabelecido controle sobre vastas regiões do Iraque e da Síria. \n"
                                + "Entre as ações que os membros do Estado Islâmico promovem contra as populações das cidades que ocupam, podemos citar:\n" +
                                "a) Crucificações e fuzilamento, mas proteção aos curdos.\n" +
                                "b) Decapitações, fuzilamento, crucificações, estupro e carbonização de pessoas vivas.\n" +
                                "c) Aliança com os sírios e fuzilamento apenas de iraquianos.\n" +
                                "d) Aliança com os curdos e fuzilamento dos sírios.\n" +
                                "e) Fuzilamento apenas de curdos.");
                        String resposta17 = JOptionPane.showInputDialog("insira a resposta");
                        char R17 = resposta17.charAt(0);
                        if (R17 == 'B' || R17 == 'b') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 17;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 18
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n18.O Estado Islâmico começou atuando na Síria, como frente de ataque ao governo de Bashar Al-Assad, depois expandiu o seu domínio para o Iraque. \n"
                                + "Em seu início, a que rede terrorista islâmica estava vinculado o EI?\n" +
                                "a) Hezbollah\n" +
                                "b) Fatah\n" +
                                "c) Al-Qaeda\n" +
                                "d) Hamas\n" +
                                "e) Setembro Negro");
                        String resposta18 = JOptionPane.showInputDialog("insira a resposta");
                        char R18 = resposta18.charAt(0);
                        if (R18 == 'C' || R18 == 'c') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 18;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 19
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n19.(UNIP) A importância da Batalha de Poitiers, em 732, no contexto da história da Europa, justifica-se em função de que:\n" +
                                "a) os cristãos foram derrotados pelos árabes, consolidando-se o feudalismo europeu;\n" +
                                "b) a derrota árabe frente ao Reino Franco impediu a islamização do Ocidente;\n" +
                                "c) a partir daí teve início a Guerra de Reconquista na Península Ibérica;\n" +
                                "d) com essa vitória, Carlos Martel tornou-se imperador dos francos;\n" +
                                "e) esse evento assinalou o limite da expansão cristã no Mediterrâneo.");
                        String resposta19 = JOptionPane.showInputDialog("insira a resposta");
                        char R19 = resposta19.charAt(0);
                        if (R19 == 'B' || R19 == 'b') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 19;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        //pergunta 20
                        JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n20.Nelson Mandela foi um dos ícones da resistência contra o regime do Apartheid na África do Sul. O seu histórico como membro da resistência \n"
                                + "dividiu a opinião pública internacional, sobretudo pelo fato de ele:\n" +
                                "a) ter recebido o Nobel da Paz.\n" +
                                "b) ter apoiado o apartheid no fim dos anos 1990.\n" +
                                "c) ter se tornado Secretário Geral da ONU.\n" +
                                "d) ter fugido da prisão onde ficou, na ilha Robben.\n" +
                                "e) ter participado da luta armada e de ações terroristas.");
                        String resposta20 = JOptionPane.showInputDialog("insira a resposta");
                        char R20 = resposta20.charAt(0);
                        if (R20 == 'E' || R20 == 'e') {
                            Acertos++;
                        } else {
                            erro++;
                            qerrada = qerrada + "Questão 20;";
                            if (erro > 5) {
                                break;
                            } else {
                            }
                        }
                        if (Acertos > 15) {
                            JOptionPane.showMessageDialog(null, "Parabéns " + nome + " por completar o Nível Intermediário, aperte OK para ver sua pontuação \n"
                                    + "lembrando que cada acerto equivale a um ponto");
                            JOptionPane.showMessageDialog(null, "Sua quantidade de acertos foi de: " + Acertos + ". E de erros foi: " + erro);
                            JOptionPane.showMessageDialog(null, "As questões que você errou foram: " + qerrada + " ");
                            break;
                        }
                    }
                }
                {
                    while (Acertos2 < 15) {

                        for (Acertos2 = 0; Acertos2 <= 20; ) {
                            erro = 0;
                            Acertos = 0;
                            JOptionPane.showMessageDialog(null, "Nível Dificil!");
                            //1
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n01.(GV) Quais as características dominantes da economia colonial brasileira? \n" +
                                    "a) propriedade latifundiária, trabalho indígena e produção monocultura;\n" +
                                    " b) propriedades diversificadas, exportação de matérias-primas e trabalho servil; \n" +
                                    "c) monopólio comercial, latifúndio e trabalho escravo de índios e negros; \n" +
                                    "d) pequenas vilas mercantis, monocultura de exportação e trabalho servil;\n" +
                                    " e) propriedade mini fundiária, colônias agrícolas e trabalho escravo.");
                            String resposta1 = JOptionPane.showInputDialog("insira a resposta");
                            char R = resposta1.charAt(0);
                            if (R == 'C' || R == 'c') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 1;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //2
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n02.(FUVEST) No Brasil colonial, a escravidão caracterizou-se essencialmente: \n" +
                                    "a) por sua vinculação exclusiva ao sistema agrário exportador; b) pelo incentivo da Igreja e da Coroa à escravidão de índios e negros;\n"
                                    + " c) por estar amplamente distribuída entre a população livre, constituindo a base econômica da sociedade; \n"
                                    + "d) por destinar os trabalhos mais penosos aos negros e mais leves aos índios; \n "
                                    + "e) por impedir a emigração em massa de trabalhadores livres para o Brasil. ");
                            String resposta2 = JOptionPane.showInputDialog("insira a resposta");
                            char R2 = resposta2.charAt(0);
                            if (R2 == 'C' || R2 == 'c') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 2;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //3
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n03.(UNIFENAS) Os governos de 1964 e 1968 caracterizaram-se por: \n" +
                                    "a) pluripartidarismo e Lei de Segurança Nacional; \n" +
                                    "b) bipartidarismo e balança comercial positiva; \n" +
                                    "c) aumento do setor tecnoburocrático e uma crescente participação do Estado na economia; \n" +
                                    "d) reforma constitucional e um crescimento das pequenas e médias empresas; \n" +
                                    "e) anistia política e uma melhor distribuição de renda. ");
                            String resposta3 = JOptionPane.showInputDialog("insira a resposta");
                            char R3 = resposta3.charAt(0);
                            if (R3 == 'C' || R3 == 'c') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 3;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //4
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n04.(UFS) No Brasil, os anos de 1954 com o suicídio de Vargas, 1961 com a renúncia de Jânio \n "
                                    + "e 1964 com a deposição de Jango, são datas que marcam os momentos críticos do: \n"
                                    + "a) populismo b) parlamentarismo \n "
                                    + "c) municipalismo d) tenentismo e) federalismo ");
                            String resposta4 = JOptionPane.showInputDialog("insira a resposta");
                            char R4 = resposta4.charAt(0);
                            if (R4 == 'A' || R4 == 'a') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 4;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //5
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n05.(MACKENZIE) O governo Juscelino Kubitschek foi responsável: \n" +
                                    "a) pela eliminação das disparidades regionais;\n" +
                                    " b) pela queda da inflação e da dívida externa;\n" +
                                    " c) por uma política nacionalista e de rejeição ao capital estrangeiro;\n" +
                                    " d) pela entrada maciça de capitais estrangeiros e a internacionalização de nossa economia; \n" +
                                    "e) por práticas antidemocráticas como a violenta repressão às rebeliões de Jacareacanga e Aragarças. ");
                            String resposta5 = JOptionPane.showInputDialog("insira a resposta");
                            char R5 = resposta5.charAt(0);
                            if (R5 == 'D' || R5 == 'd') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 5;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //6
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n06.(UFS) No Governo de Juscelino Kubitschek, a base do seu programa administrativo era \n"
                                    + "constituído do trinômio:\n" +
                                    "a) saúde, habitação e educação;\n" +
                                    "b) estradas, energia e transporte; \n" +
                                    "c) indústria, exportação e importação;\n" +
                                    "d) agricultura, pecuária e reforma agrária; \n" +
                                    "e) comércio, sistema viário e poupança. ");
                            String resposta6 = JOptionPane.showInputDialog("insira a resposta");
                            char R6 = resposta6.charAt(0);
                            if (R6 == 'B' || R6 == 'b') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 6;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //7
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n07.(UNIP) O projeto nacional desenvolvimentista implicou a substituição das importações \n "
                                    + "e foi implementado, principalmente, no governo do presidente:\n" +
                                    "a) Juscelino Kubitschek b) Jânio Quadros c) General Emílio Médici d) Marechal Costa e Silva e) General Eurico Dutra.");
                            String resposta7 = JOptionPane.showInputDialog("insira a resposta");
                            char R7 = resposta7.charAt(0);
                            if (R7 == 'A' || R7 == 'a') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 7;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //8
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n08.O Parlamentarismo funcionou nas seguintes épocas no Brasil: \n" +
                                    "a) No governo de D. Pedro II e no governo de João Goulart.\n" +
                                    "b) No primeiro Império - Governo de D. Pedro II.\n" +
                                    "c) No governo de Getúlio Vargas após 1937. \n" +
                                    "d) Logo após a Proclamação da República. \n" +
                                    "e) Nos primeiros três anos da Ditadura Militar iniciada em 1964. ");
                            String resposta8 = JOptionPane.showInputDialog("insira a resposta");
                            char R8 = resposta8.charAt(0);
                            if (R8 == 'A' || R8 == 'a') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 8;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //9
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n09.(FUVEST) A política cultural do Estado Novo com relação aos intelectuais caracterizou-se: \n" +
                                    "a) pela repressão indiscriminada, por serem os intelectuais considerados adversários de regimes ditatoriais; \n" +
                                    "b) por um clima de ampla liberdade pois o governo cortejava os intelectuais para obter apoio ao seu projeto nacional; \n" +
                                    "c) pela indiferença, pois os intelectuais não tinham expressão e o governo se baseava nas forças militares; \n" +
                                    "d) pelo desinteresse com relação aos intelectuais, pois o governo se apoiava nos trabalhadores sindicalizados; \n" +
                                    "e) por uma política seletiva através da qual só os adversários frontais do regime foram reprimidos. ");
                            String resposta9 = JOptionPane.showInputDialog("insira a resposta");
                            char R9 = resposta9.charAt(0);
                            if (R9 == 'E' || R9 == 'e') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 9;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //10
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n10.(FGV) \"Redescobrir e revolucionar é também o lema do Verde-Amarelismo, que, antes de \n "
                                    + "organizar-se no movimento Anta (Cassiano Ricardo, Menotti del Picchia, Plínio Salgado) e materializar-se no ideário \n "
                                    + "'curupira', passa pela xenofobia espingardeira da Revista Brasília.\" O texto acima fala de um movimento literário do "
                                    + "\n Brasil dos anos 30, que tem correspondência político-ideológica com:\n" +
                                    "a) o Integralismo \n" +
                                    "b) o Marxismo-lenilismo \n" +
                                    "c) o Anarco-sindicalismo \n" +
                                    "d) o Socialismo Utópico \n" +
                                    "e) a Maçonaria");
                            String resposta10 = JOptionPane.showInputDialog("insira a resposta");
                            char R10 = resposta10.charAt(0);
                            if (R10 == 'A' || R10 == 'a') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 10;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //11
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n11.(UFRJ) A expressão Estado Novo foi empregada para identificar um fato histórico a partir do momento em que: \n" +
                                    "a) entrou em vigor a terceira Constituição brasileira, a de 1934;\n" +
                                    "b) foram reunidos num só os Estados do Rio de Janeiro e da Guanabara; \n" +
                                    "c) Getúlio Vargas outorgou ao País a Carta de 1937, que lhe conferia plenos poderes; d) assumiu a Presidência da república, Jânio Quadros;\n" +
                                    "e) assumiu a Presidência da República, João Goulart.");
                            String resposta11 = JOptionPane.showInputDialog("insira a resposta");
                            char R11 = resposta11.charAt(0);
                            if (R11 == 'C' || R11 == 'c') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 11;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //12
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n12.(UFES) Confederação do Equador: Manifesto Revolucionário Brasileiros do Norte! Pedro de Alcântara, filho \n"
                                    + "de D. João VI, rei de Portugal, a quem vós, após uma estúpida condescendência com os brasileiros do Sul, aclamastes vosso imperador, quer descaradamente\n"
                                    + " escravizar-vos. Que desaforo atrevimento de um europeu no Brasil. Acaso pensara esse estrangeiro ingrato e sem costumes que tem algum direito à \n "
                                    + "Coroa, por descender da casa de Bragança na Europa, de quem já fomos independentes de fato e de direito? Não há delírio igual (...). \n"
                                    + "(BRANDÃO, Ulysses de Carvalho. A Confederação do Equador, Pernambuco: Publicações Oficiais, 1924) A causa da Confederação do Equador foi a: \n" +
                                    "a) extinção do Poder Legislativo pela Constituição de 1824 e sua substituição pelo Poder Moderador; \n" +
                                    "b) mudança do sistema eleitoral na Constituição de 1824, que vedava aos brasileiros o direito de se candidatar ao Parlamento, o que só era possível aos portugueses; \n" +
                                    "c) atitude absolutista de D. Pedro I, ao dissolver a Constituinte de 1823 e outorgar uma Constituição que conferia amplos poderes ao imperador; \n" +
                                    "d) liberação do sistema de mão-de-obra nas disposições constitucionais, por pressão do grupo português, que já não detinha o controle das grandes fazendas e da produção do açúcar; \n" +
                                    "e) restrição às vantagens do comércio do açúcar pelo reforço do monopólio português e aumento dos tributos contidos na Carta Constitucional.");
                            String resposta12 = JOptionPane.showInputDialog("insira a resposta");
                            char R12 = resposta12.charAt(0);
                            if (R12 == 'C' || R12 == 'c') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 12;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //13
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n13.(CESGRANRIO) O período regencial que se iniciou em 1831teve no Ato Adicional de 1834 um \n"
                                    + "alento de abertura e um ensaio de um regime menos centralizado. Para os monarquistas conservadores, a Regência foi uma \n"
                                    + "“verdadeira” República, que mostrou sua ineficiência. Tal período é caracterizado como sendo de crise. Segundo o \n"
                                    + "texto, pode-se dizer que a crise ocorreu porque: \n" +
                                    "a) a descentralização de um desejo antigo dos conservadores; \n" +
                                    "b) a centralização “encarnava” bem o espírito republicano; \n" +
                                    "c) a partilha do poder não se coadunava com o espírito republicano; \n" +
                                    "d) a descentralização provocou a reação dos meios conservadores; \n" +
                                    "e) a descentralização se opunha aos princípios liberais.");
                            String resposta13 = JOptionPane.showInputDialog("insira a resposta");
                            char R13 = resposta13.charAt(0);
                            if (R13 == 'D' || R13 == 'd') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 13;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //14
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n14.(UCSAL) A atual configuração do território brasileiro foi definida em suas linhas\n"
                                    + " gerais, na época do marquês de Pombal, pelo Tratado de: \n" +
                                    "a) Lisboa b) Madri c) Utrecht d) Tordesilhas e) Badajoz");
                            String resposta14 = JOptionPane.showInputDialog("insira a resposta");
                            char R14 = resposta14.charAt(0);
                            if (R14 == 'B' || R14 == 'b') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 14;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //15
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n15.(UNIFENAS) Foram conseqüências da mineração, exceto: \n" +
                                    "a) o surgimento de um mercado interno; b) a urbanização; c) a melhoria do nível cultural; d) a decadência da atividade açucareira; \n"
                                    + "e) a maior fiscalização da Coroa sobre a Colônia. ");
                            String resposta15 = JOptionPane.showInputDialog("insira a resposta");
                            char R15 = resposta15.charAt(0);
                            if (R15 == 'D' || R15 == 'd') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 15;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //16
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n16.(UNIP) Após a restauração Portuguesa, ocorrida em 1640:\n"
                                    + " a) as relações entre Portugal e o Brasil tornaram-se mais liberais; \n"
                                    + "b) a autonomia administrativa do Brasil foi ampliada; c) o Pacto Colonial luso enrijeceu-se;\n"
                                    + " d) os capitães-donatários forma substituídos pelos vice-reis;\n"
                                    + " e) a justiça colonial passou a ser exercida pelos \"homens novos\". ");
                            String resposta16 = JOptionPane.showInputDialog("insira a resposta");
                            char R16 = resposta16.charAt(0);
                            if (R16 == 'C' || R16 == 'c') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 16;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //17
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n17.(FATEC) Bandeiras eram: a) expedições de portugueses que atraíam as tribos\n"
                                    + " indígenas para serem catequizadas pelos jesuítas; b) expedições organizadas pela Coroa com o objetivo de \n"
                                    + "conquistar as áreas litorâneas e ribeirinhas do país; c) expedições particulares que aprisionavam índios e buscavam \n"
                                    + "metais e pedras preciosas; d) movimentos catequistas liderados pelos jesuítas e que pretendiam formar uma nação indígena \n"
                                    + "cristã; e) expedições financiadas pela Coroa cujo objetivo era exclusivamente descobrir metais e pedras preciosas.");
                            String resposta17 = JOptionPane.showInputDialog("insira a resposta");
                            char R17 = resposta17.charAt(0);
                            if (R17 == 'C' || R17 == 'c') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 17;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //18
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n18.(FUVEST) No século XVII, contribuíram para a penetração do interior brasileiro: \n" +
                                    "a) o desenvolvimento da cultura da cana-de-açúcar e a cultura de algodão;\n" +
                                    "b) o apresamento de indígenas e a procura de riquezas minerais; \n" +
                                    "c) a necessidade de defesa e o controle aos franceses; \n" +
                                    "d) o fim do domínio espanhol e a restauração da monarquia portuguesa; \n" +
                                    "e) a Guerra dos Emboabas e a transferência da capital da colônia para o Rio de Janeiro. ");
                            String resposta18 = JOptionPane.showInputDialog("insira a resposta");
                            char R18 = resposta18.charAt(0);
                            if (R18 == 'B' || R18 == 'b') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 18;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //19
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n19.(ESA) Para controlar gastos e investimentos,\n" +
                                    "priorizando saúde, alimentação, transportes e\n" +
                                    "energia, foi criado o Plano Salte, que tem esse nome\n" +
                                    "por ser a sigla composta pelas letras iniciais das\n" +
                                    "prioridades. É correto afirmar que o Plano Salte foi\n" +
                                    "lançado no governo de:\n" +
                                    "A) Juscelino Kubitschek.\n" +
                                    "B) Getúlio Vargas, durante o Estado Novo.\n" +
                                    "C) Dutra.\n" +
                                    "D) João Goulart.\n" +
                                    "E) Jânio Quadros.");
                            String resposta19 = JOptionPane.showInputDialog("insira a resposta");
                            char R19 = resposta19.charAt(0);
                            if (R19 == 'C' || R19 == 'c') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 19;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            //20
                            JOptionPane.showMessageDialog(null, "Acertos: " + Acertos + "\nErros: " + erro + "\n20.(ESPCEX) Em 1993, no Brasil, anunciou-se um novo plano de estabilização\n"
                                    + " econômica, o Plano Real, que entrou em vigor efetivamente em julho de 1994. O Plano Real foi planejado \n"
                                    + "e implantado no governo do presidente: a) José Sarney b) Fernando Collor de Mello \n"
                                    + "c) Itamar Franco d) Fernando Henrique Cardoso e) Luís Inácio Lula da Silva.");
                            String resposta20 = JOptionPane.showInputDialog("insira a resposta");
                            char R20 = resposta20.charAt(0);
                            if (R20 == 'D' || R20 == 'd') {
                                Acertos++;
                            } else {
                                erro++;
                                qerrada = qerrada + "Questão 20;";
                                if (erro > 5) {
                                    break;
                                } else {
                                }
                            }
                            if (Acertos > 15) {
                                JOptionPane.showMessageDialog(null, "Parabéns " + nome + " por completar o Nível Difícil, aperte OK para ver sua pontuação \n"
                                        + "lembrando que cada acerto equivale a um ponto");
                                JOptionPane.showMessageDialog(null, "Sua quantidade de acertos foi de: " + Acertos + ". E de erros foi: " + erro);
                                JOptionPane.showMessageDialog(null, "As questões que você errou foram: " + qerrada + " ");
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}
