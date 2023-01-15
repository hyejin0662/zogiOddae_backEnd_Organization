package com.zerobase.leisure.domain.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {
	SUCCESS_CODE("성공적으로 작업을 수행 했습니다."),


	SERVER_INTERVAL_ERROR("서버 내부적 오류입니다."),
	NOT_HAD_REVIEW("등록된 리뷰가 없습니다."),
	REVIEW_NOT_FOUND("리뷰를 찾을 수 없습니다."),
	NOT_HAVE_LEISURE("등록된 레저 시설이 없습니다."),
	NOT_FOUND_LEISURE("레저 시설을 찾을 수 없습니다."),
	ALREADY_DENIED_USER("이미 사용이 거부된 유저입니다."),
	NOT_FOUND_USER("회원을 찾을 수 없습니다."),
	NOT_HAD_BLACKLIST("블랙리스트가 없습니다."),
	NOT_HAD_WISHLIST("찜한 상품이 없습니다."),
	ALREADY_ISSUED_COUPON("이미 발급받은 쿠폰입니다"),
	EXPIRED_COUPON("기한 만료된 쿠폰입니다."),
	EXCEEDED_COUNT_COUPON("남은 쿠폰이 없습니다."),
	NOT_REGISTERED_COUPON_GROUP("등록되지 않은 쿠폰입니다.")
	;


	private final String description;
}
