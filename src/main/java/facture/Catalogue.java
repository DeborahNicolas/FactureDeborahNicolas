package facture;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    List<Article> catalogueArticles = new ArrayList<>();
    
    public void addArticle(Article article) {
        catalogueArticles.add(article);
    }
    
    
    
    
    /* Il y a une erreur que je n'arrive pas à corriger
    
    public Article findByCode(String code) {
        for( int k=0; k< catalogueArticles.size(); k++){
            if (code == catalogueArticles.get(k).getCode()){
                System.out.println(catalogueArticles.get(k).getNom());
            }
        }
        return null;
    }
*/
}
