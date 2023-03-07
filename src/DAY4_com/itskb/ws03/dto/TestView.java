package DAY4_com.itskb.ws03.dto;

public class TestView {

	public static void main(String[] args) {
		System.out.println("***1. 고객 Seq에 해당하는 계좌 정보 검색하기 ***");
		
		BankService service = new BankService();
		
		AccountDto[] accountList = service.getAccountList(400);
		
		if(accountList == null) {
			System.out.println("회원의 계좌 정보가 없습니다.");
		}else{
			for(AccountDto x : accountList) {
				System.out.println(x.accountNumber);
			}
		}
		System.out.println();
		
		System.out.println("***2. userSeq에 해당하는 고객의 정보 **********");
		UserDto userDto = service.getUserDetail(100);
		if(userDto != null) {
			System.out.print(userDto.userSeq+" , " + userDto.name+" , "+userDto.email+" , ");
			System.out.println(userDto.phone+" , " + userDto.isSleep);			
		}else {
			System.out.println("회원의 계좌 정보가 없습니다.");
			
		}
		
		
		
	}

}
