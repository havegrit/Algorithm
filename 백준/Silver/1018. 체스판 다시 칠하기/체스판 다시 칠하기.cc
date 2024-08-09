#include <stdio.h>

char W[8][8] = {
		{'W','B','W','B','W','B','W','B'},
		{'B','W','B','W','B','W','B','W'},
		{'W','B','W','B','W','B','W','B'},
		{'B','W','B','W','B','W','B','W'},
		{'W','B','W','B','W','B','W','B'},
		{'B','W','B','W','B','W','B','W'},
		{'W','B','W','B','W','B','W','B'},
		{'B','W','B','W','B','W','B','W'}
};
char B[8][8] = {
	{'B','W','B','W','B','W','B','W'},
	{'W','B','W','B','W','B','W','B'},
	{'B','W','B','W','B','W','B','W'},
	{'W','B','W','B','W','B','W','B'},
	{'B','W','B','W','B','W','B','W'},
	{'W','B','W','B','W','B','W','B'},
	{'B','W','B','W','B','W','B','W'},
	{'W','B','W','B','W','B','W','B'}
};
char board[51][51] = {};

int W_cnt(int n, int m) {
	int cnt = 0;
	int tmp = 64;
	for (int k = 0; k <= n - 8; k++) {
		for (int p = 0; p <= m - 8; p++) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (W[i][j] != board[i + k][j + p]) cnt++;
				}
			}
			if (tmp > cnt) tmp = cnt;
			cnt = 0;
		}
	}

	return tmp;
}

int B_cnt(int n, int m) {
	int cnt = 0;
	int tmp = 64;
	for (int k = 0; k <= n - 8; k++) {
		for (int p = 0; p <= m - 8; p++) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (B[i][j] != board[i + k][j + p]) cnt++;					
				}
			}
			if (tmp > cnt) tmp = cnt;
			cnt = 0;
		}
	}

	return tmp;
}

int main() {
	int n, m;
	int tmp = 64;

	scanf("%d %d", &n, &m);

	for (int i = 0; i < n; i++) {
		scanf("%s", board[i]);
	}

	printf("%d\n", (W_cnt(n, m) > B_cnt(n, m) ? B_cnt(n, m) : W_cnt(n, m)));

	return 0;
}