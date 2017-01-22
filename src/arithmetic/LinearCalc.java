package arithmetic;

import org.apache.commons.math3.linear.*;

public class LinearCalc {

	public static int[] calcLinearSystem(int x14, int x13, int x12, int x11,
								 int x24, int x23, int x22, int x21,
								 int x34, int x33, int x32, int x31,
								 int x44, int x43, int x42, int x41,
								 int d1, int d2, int d3, int d4){
	double[][] matr = {
			{x14,x13,x12,x11},
			{x24,x23,x22,x21},
			{x34,x33,x32,x31},
			{x44,x43,x42,x41}
			};
			double[] vect = {d1,d2,d3,d4};
			RealMatrix coef = new Array2DRowRealMatrix(matr);
			DecompositionSolver solver= new LUDecomposition(coef).getSolver();
			RealVector right = new ArrayRealVector(vect);
			RealVector x = solver.solve(right);
			double[] ans = x.toArray();
			int[] result = new int[4];
			for (int i=0; i<4; i++) {
			result[i] = (int) Math.round(ans[i]);
			}	
			return result;
	}
}
