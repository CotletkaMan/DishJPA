package shared;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
public class Dish implements Comparable<Dish> {
	@Id
	@GeneratedValue
	long id;
	
	@Column(name = "Name", nullable = false, unique = true)
	String name;
	
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "Image" , nullable = false)
	byte[] image;
	
	@Column(name = "Description", length = 500)
	String description;
	
	@Column(name = "Master", length = 100)
	String master;
	
	@Temporal(TemporalType.TIME)
	Date timeCooking;
	
	@Enumerated(EnumType.STRING)
	Categories category;
	
    @Column(name = "steps" , nullable = false)
	ArrayList<String> recipe;
	
    @ElementCollection
    @OneToMany(mappedBy = "owner")
    @MapKeyEnumerated(EnumType.STRING)
    @MapKeyColumn(name = "Ingredient" , nullable = false)
	HashMap<Ingredients , Integer> listIngredients;
    
    public void setId(long id){
    	this.id = id;
    }
    
    public long getId(){
    	return id;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    public String getName(){
    	return name;
    }
    
    public void setImage(byte[] image){
    	this.image = image;
    }
    
    public byte[] getImage(){
    	return image;
    }
    
    public void setDescription(String description){
    	this.description = description;
    }
    
    public String getDescription(){
    	return description;
    }
    
    public void setMaster(String master){
    	this.master = master;
    }
    
    public String getMaster(){
    	return master;
    }
    
    public void setTimeCooking(Date date){
    	this.timeCooking = date;
    }
    
    public Date getTimeCooking(){
    	return timeCooking;
    }
    
    public void setCategory(Categories category){
    	this.category = category;
    }
    
    public Categories getCategory(){
    	return category;
    }
    
    public void setRecipe(ArrayList<String> recipe){
    	this.recipe = recipe;
    }
    
    public ArrayList<String> getRecipe(){
    	return recipe;
    }
    
    public void setListIngredients(HashMap<Ingredients , Integer> ingredients){
    	this.listIngredients = ingredients;
    }
    
    public HashMap<Ingredients , Integer> getListIngredients(){
    	return this.listIngredients;
    }

    public int compareTo(Dish dish){
        if(id - dish.getId() > 0)
            return 1;
        return (id - dish.getId()) < 0 ? -1 : 0;
    }
}
