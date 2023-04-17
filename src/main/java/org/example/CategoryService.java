package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CategoryService {
    List<Category> categories = new ArrayList<Category>();
    List<SubCategory> subCategories = new ArrayList<SubCategory>();
    public void initialize(){
        var bookCat = new Category("book");
        categories.add( bookCat );
        subCategories.add( new SubCategory( "Roman" , bookCat ) );
        subCategories.add( new SubCategory( "History" , bookCat ) );

        var electronicsCat = new Category("electronics");
        categories.add( electronicsCat );
        subCategories.add( new SubCategory( "Phone" , electronicsCat ) );
        subCategories.add( new SubCategory( "HeadSet" , electronicsCat ) );
        var homeCat=new Category("home");
        categories.add( homeCat );
        subCategories.add( new SubCategory( "sofa" , homeCat ) );
        subCategories.add( new SubCategory( "table" , homeCat ) );
        var beautyCat=new Category("beauty");
        categories.add( beautyCat );
        subCategories.add( new SubCategory( "make up" , beautyCat ) );
        subCategories.add( new SubCategory( "skin care" , beautyCat ) );
        var health=new Category("health");
        categories.add( health );
        subCategories.add( new SubCategory( "medicine" , health ) );
        subCategories.add( new SubCategory( "first ad kit" , health ) );
        var food=new Category("food");
        categories.add( food );
        subCategories.add( new SubCategory( "grocery" , food ) );
        subCategories.add( new SubCategory( "meat" , food ) );
        var kids=new Category("kids");
        categories.add( kids );
        subCategories.add( new SubCategory( "toy" , kids ) );
        subCategories.add( new SubCategory( "clothes" , kids ) );
        var sport=new Category("sport");
        categories.add( sport );
        subCategories.add( new SubCategory( "bike" , sport ) );
        subCategories.add( new SubCategory( "ball" , sport ) );
        var pet=new Category("pet");
        categories.add( pet );
        subCategories.add( new SubCategory( "pet clothes" , pet ) );
        subCategories.add( new SubCategory( "pet toy" , pet ) );
        var school=new Category("school");
        categories.add(school );
        subCategories.add( new SubCategory( "stationery" , school ) );
        subCategories.add( new SubCategory( "school book" , school ) );
    }

    public List<Category> getAll(){
        return categories;
    }
    public void printAllCategories(){
        for( var category : categories) {
            System.out.println(category.getName());
            for( SubCategory sub : subCategories ){
                if( sub.getCategory().getId() == category.getId())
                    System.out.println((sub.getName()+" "+sub.getCategory().getName()));
            }
        }
    }

}
