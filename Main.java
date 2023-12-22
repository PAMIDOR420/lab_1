public class Main{
    public static void main(String[] args) throws Exception{
        Food[] breakfast=new Food[args.length];
        for(int i=0;i<args.length;i++){
            String[] parts=args[i].split("/");
            if(parts[0].equals("Cheese")){
                breakfast[i]=new Cheese();
            }else if(parts[0].equals("Apple")){
                breakfast[i]=new Apple(parts[1]);
            }else if(parts[0].equals("Cake")){
                breakfast[i]=new Cake(parts[1]);
            }
        }
        for(Food item:breakfast){
            item.consume();
        }

        new Cake("Caramel");
        System.out.println("Cheese eaten: " + countFood(breakfast, new Cheese()));
        System.out.println("Apples eaten: " + countFood(breakfast, new Apple("")));
        System.out.println("Cakes eaten: " + countFood(breakfast, new Cake("")));
        System.out.println("Best regards!");
    }

    static Integer countFood(Food[] breakfast, Food food) {
        Integer count = 0;
        for(int i = 0; i < breakfast.length; i++) 
        {
            if(food.equals(breakfast[i]))
            {
                count++;
            }
        }
        return count;
    }
}
