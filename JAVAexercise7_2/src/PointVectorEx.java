import java.util.Vector;

public class PointVectorEx {
	public static void main(String[] args) {
		//Point 객체를 요소로만 가지는 벡터 생성
		Vector <Point> v = new Vector<Point>();
		
		//3개의 Point 객체 삽입
		v.add(new Point(2,3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		v.remove(1);	//1번인덱스에 있는 Point(-5, 20)객체 삭제
		
		//벡터에 있는 Point 객체 모두 검색 하여 출력
		for(int i =0; i<v.size();i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
		
	}
}
