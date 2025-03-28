
public class Matrix {
    int[][] data;
    private int minimum;
    private int maximum;

    public Matrix(int lines, int columns, int minimum, int maximum) {
        data = new int[lines][columns];
        this.minimum = minimum;
        this.maximum = maximum;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = (int) (Math.random() * (maximum - minimum + 1) + minimum);
            }
        }
    }
            
    public Matrix(Matrix other) {
        this.data = new int[other.data.length][other.data[0].length];
        this.minimum = other.minimum;
        this.maximum = other.maximum;

        for (int i = 0; i < other.data.length; i++) {
            for (int j = 0; j < other.data[i].length; j++) {
                this.data[i][j] = other.data[i][j];
            }
        }
    }
    
    public void show() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public boolean isSquare() {
    	if (data.length == data[0].length)
    		return true;
    		else
    			return false;
    	}
    
    public boolean isSingular() {
    	if (isSquare()) {
    		for (int i = 0; i < data.length; i++) {
    			if (data[i][i] != 1) {
    				return false;
    			}
    		}
    		for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data.length; j++) {
                    if (i != j && data[i][j] != 0) {
                        return false; 
                    }
                }
            }
            
            return true; 
        }
        
        return false; 
    }
    
    public boolean isSymmetric() {
        if (!isSquare()) {
            return false; 
        }

        int[][] transpose = new int[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                transpose[j][i] = data[i][j];
            }
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != transpose[i][j]) {
                    return false; 
                }
            }
        }

        return true; 
    }
    
    public boolean isEqual(Matrix other) {
    	if(this.data.length != other.data.length || this.data[0].length != other.data[0].length) {
    		return false;
    	}
    	 for (int i = 0; i < data.length; i++) {
             for (int j = 0; j < data[i].length; j++) {
                 if (this.data[i][j] != other.data[i][j]) {
                     return false; 
                 }
    }
    	 }
    	return true;
    	 }
    
    public boolean isUppertriangle() {
        if (!isSquare()) {
            return false; 
        }

        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < i; j++) {
                if (data[i][j] != 0) {
                    return false; 
                }
            }
        }

        return true; 
    }

    public static void main(String[] args) {
  
        Matrix m1 = new Matrix(3, 3, 0, 1);
        Matrix m2 = new Matrix(m1);
        Matrix m3 = new Matrix(4, 5, 2, 7);
        System.out.println("m1:");
        m1.show();
        System.out.println();
        System.out.println("m2:");
        m2.show();
        System.out.println();
        System.out.println(m1.isSquare());
        System.out.println(m1.isSingular());
        System.out.println(m1.isSymmetric());
        System.out.println(m1.isEqual(m2));
        System.out.println(m1.isUppertriangle());
        System.out.println();
        System.out.println("m1:");
        m1.show();
        System.out.println();
        System.out.println("m3:");
        m3.show();
        System.out.println();
        System.out.println(m3.isSquare());
        System.out.println(m3.isSingular());
        System.out.println(m3.isSymmetric());
        System.out.println(m3.isEqual(m1));
        System.out.println(m3.isUppertriangle());
    }
    }



