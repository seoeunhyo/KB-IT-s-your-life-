package DAY4_com.itskb.ws03.dto;

import java.util.ArrayList;
import java.util.List;

public class TestView {

	public static void main(String[] args) {
		System.out.println("***1. 고객 Seq에 해당하는 계좌 정보 검색하기 ***");
		
		BankService service = new BankService();
		
		ArrayList<AccountDto> accountList = service.getAccountList(100);
		ArrayList<UserDto> userList = service.getUserDetail(100);

		if(accountList == null) {
			System.out.println("회원의 계좌 정보가 없습니다.");
		}
		for(AccountDto x : accountList) {
			System.out.println(x);
		}
		System.out.println();
		
		System.out.println("***2. userSeq에 해당하는 고객의 정보 **********");
		if(userList == null) {
			System.out.println("회원의 계좌 정보가 없습니다.");
		}
		for(UserDto x : userList) {
			System.out.println(x);
		}
		System.out.println();
		System.out.println("***3. *********모든 계좌 리스트 ***************");
		
		ArrayList<AccountDto> ad = service.getAccountList();
		for(AccountDto x : ad) {
			System.out.println(x);
		}
		
		
		System.out.println("***4. ********* 잔고로 정렬 ***************");
		ArrayList<AccountDto> tmp = service.getAccountListSortByBalance();
		for(AccountDto x : tmp) {
			System.out.println(x);
		}
	}

}
