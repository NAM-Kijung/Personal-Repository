
public class FoodManager {
	private static FoodManager instance = new FoodManager();

	public static FoodManager getInstance() {
		return instance;
	}

	private Food[] food;
	private int size;

	private FoodManager() {
		this.food = new Food[100];
		this.size = 0;
	}

	public int getSize() {
		return this.size;
	}

	public void add(Food food) {
		this.food[this.size++] = food;
	}

	public void removeFood(String name) {
		for (int i = 0; i < size; i++) {
			if (name.equals(food[i].getName())) {
				for(int j = i; j < size -1; j++) {
					food[j] = food[j+1];		
				}
			} 
		} 
		food[size-1] = null;
		size--;
	}
	public Food[] sortKcal() {
		Food[] fd = new Food[size];
		for(int i = 0; i < size; i++) {
			fd[i] = this.food[i];
		}
		for (int i = 0; i <size-1; i++) {
			for (int j = i+1; j < size; j++) {
				if(fd[i].getKcal()>fd[j].getKcal()) {
					Food tmp = fd[i];
					fd[i] = fd[j];
					fd[j] = tmp;
				}
			}
		}
		return fd;
	}
	public Food[] sortPrice() {
		Food[] fd = new Food[size];
		for(int i = 0; i < size; i++) {
			fd[i] = this.food[i];
		}
		for (int i = 0; i <size-1; i++) {
			for (int j = i+1; j < size; j++) {
				if(fd[i].getPrice()>fd[j].getPrice()) {
					Food tmp = fd[i];
					fd[i] = fd[j];
					fd[j] = tmp;
				}
			}
		}
		return fd;
	}
	public Food[] sortProtein() {
		Food[] fd = new Food[size];
		for(int i = 0; i < size; i++) {
			fd[i] = this.food[i];
		}
		for (int i = 0; i <size-1; i++) {
			for (int j = i+1; j < size; j++) {
				if(fd[i].getProtein()<fd[j].getProtein()) {
					Food tmp = fd[i];
					fd[i] = fd[j];
					fd[j] = tmp;
				}
			}
		}
		return fd;
	}
	public Food[] sortRate() {
		Food[] fd = new Food[size];
		for(int i = 0; i < size; i++) {
			fd[i] = this.food[i];
		}
		for (int i = 0; i <size-1; i++) {
			for (int j = i+1; j < size; j++) {
				if(fd[i].getRate()<fd[j].getRate()) {
					Food tmp = fd[i];
					fd[i] = fd[j];
					fd[j] = tmp;
				}
			}
		}
		return fd;
	}
//	public Movie[] getList() {
//		Movie[] tmp = new Movie[size];
//			for(int i = 0; i <size; i++)
//				tmp[i] = movies[i];
//				return tmp; // null ???????????? ????????? ????????? ?????? ????????? ?????? ??????
//		}
//	public Movie[] searchByTitle(String keyword) {
//		int cnt = 0;
//		for(int i = 0; i<size; i++) {
//			if(movies[i].getTitle().contains(keyword)) {
//				cnt++;
//			}//???????????? ????????? ?????? ???????????? ????????? ????????? ????????? ??????
//		}
//		Movie[] tmp = new Movie[cnt];
//		int idx = 0;
//		for(int i =0; i < size; i++) {
//			if (movies[i].getTitle().contains(keyword)) {
//				//????????? movies[i]????????? tmp????????? ???????????? ????????? ??????.
//				tmp[idx++] = movies[i];
//			}
//		}
//		return tmp; //????????? ????????? ?????? ????????? ?????? ????????????
//	}
}
