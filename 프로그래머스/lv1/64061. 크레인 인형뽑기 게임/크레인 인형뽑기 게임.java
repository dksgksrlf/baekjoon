class Solution {
    public int solution(int[][] board, int[] moves) {
        int[] basket = new int[moves.length]; // 인형을 담을 바구니
		int count=0;
		int basketTop = 0;
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i]-1] != 0) {
					if (basketTop== 0) {
						basket[basketTop] = board[j][moves[i]-1];
						basketTop++;
						board[j][moves[i]-1] = 0;
						break;
					}
					if (basket[basketTop - 1] != board[j][moves[i]-1]) {
						basket[basketTop] = board[j][moves[i]-1];
						basketTop++;
					} else {
						basketTop--;
						count++;
						basket[basketTop] = 0;
					}

					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		int answer = count*2;
        return answer;
    }
}