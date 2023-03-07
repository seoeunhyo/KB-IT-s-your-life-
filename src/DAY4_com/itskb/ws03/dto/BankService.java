package DAY4_com.itskb.ws03.dto;

import javax.naming.directory.SearchControls;

/**
 * 고객과 계좌에 관련된 서비스 
 * (Business Logic을 처리하는 객체)
 **/

public class BankService {
	//final은 고정 값 = 값 변경 불가(반드시 초기화 필수)
	final int ACCOUNT_SIZE = 10; /**계좌 최대개수**/
	final int USER_SIZE = 5; /**고객 최대개수**/
	int ACCOUNT_CURRENT_SIZE; /**현재 계좌 개수 **/
	int USER_CURRENT_SIZE; /** 현재 고객의 개수 **/
	AccountDto[] accountList = new AccountDto[ACCOUNT_SIZE];
	UserDto[] userList = new UserDto[USER_SIZE];
	
	
	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를
	 * 생성하고 배열에 저장한다. 
	 */
	public BankService() {
		//배열 생성
		userList = new UserDto[USER_SIZE];
		accountList = new AccountDto[ACCOUNT_SIZE];
		
		
		//각 배열방에 고객과 계좌를 생성한다.
		//고객 3명
		userList[USER_CURRENT_SIZE++] = new UserDto(100, "홍길동", "123@naver", "010-123-123", false);
		userList[USER_CURRENT_SIZE++] = new UserDto(200, "최치원", "234@naver", "010-456-123", false);
		userList[USER_CURRENT_SIZE++] = new UserDto(300, "서은효", "456@naver", "010-789-123", false);
		
		//계좌 7개 
		accountList[ACCOUNT_CURRENT_SIZE++] = new AccountDto(1,"111-1111",1000000, 100);
		accountList[ACCOUNT_CURRENT_SIZE++] = new AccountDto(2,"222-1111",2500000, 100);
		accountList[ACCOUNT_CURRENT_SIZE++] = new AccountDto(3,"333-1111",4500000, 100);
	
		accountList[ACCOUNT_CURRENT_SIZE++] = new AccountDto(4,"444-1111",6700000, 200);
		accountList[ACCOUNT_CURRENT_SIZE++] = new AccountDto(5,"555-1111",7800000, 200);
		
		accountList[ACCOUNT_CURRENT_SIZE++] = new AccountDto(6,"666-1111",900000000, 300);
		
	}//생성자 종료 
	
	public UserDto[] get() {
		UserDto arr [] = new UserDto[10];
		for(int i =0; i<userList.length;i++) {
			arr[i] = userList[i];
		}
		return arr;
	}
	
	/**
	 *특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다. 
	 */
	public AccountDto[] getAccountList(int userSeq) {
		
		int searchAccountcount = 0;
		
		for(int i =0; i<ACCOUNT_CURRENT_SIZE;i++) {
			if(accountList[i] .userSeq == userSeq) {
				searchAccountcount++;
			}
		}
		
		//
		//위에서 찾은 정보를 바탕으로 AccountDto 배열에서 계좌 정보를 찾아서 리턴해준다.
		//찾은 고객의 계좌의 수만큼 배열을 생성해서 그 배열을 리턴 
		
		if(searchAccountcount == 0)
			return null;
		AccountDto searchAccountDtoList[] = new AccountDto[searchAccountcount];
		
		
		int cnt = 0;
		for(int i =0; i<ACCOUNT_CURRENT_SIZE;i++) {
			if(accountList[i] .userSeq == userSeq) {
				searchAccountDtoList[cnt++] = accountList[i];
			}
		}
		
		
		
		return searchAccountDtoList;
	}
	
	
	
	/**
	 * 	특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다.
	 * @param : 고객의 sequence
	 * @return: null이면 고객의 정보 없다 
	 */
	public UserDto getUserDetail(int userSeq) {
		
		for(int i =0;i<USER_CURRENT_SIZE;i++) {
			if(userList[i].userSeq == userSeq) {
				return userList[i];
			}
		}
		return null;
	}
}
