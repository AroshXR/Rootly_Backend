package net.epiclanka.merchant.utility;

public class EndPoint {
    public static final String LEGAL_STATUS_ADMIN = "/v1/admin/legal-status";

    public static final String LEGAL_STATUS_FILTERED_LIST = "/v1/admin/legal-status/list";

    public static final String LEGAL_STATUS_ADMIN_DETAILS = "/v1/admin/legal-status/detail";

    public static final String LEGAL_STATUS_ADMIN_DROPDOWN_LIST = "/v1/admin/legal-status/dropdown-list";
    public static final String LEGAL_STATUS_LIST = "/v1/legalStatusList";

    public static final String MERCHANT_CATEGORY_ADMIN = "/v1/admin/merchant-category";

    public static final String MERCHANT_CATEGORY_FILTERED_LIST = "/v1/admin/merchant-category/list";

    public static final String MERCHANT_CATEGORY_ADMIN_DETAILS = "/v1/admin/merchant-category/detail";

    public static final String TERMINAL_TYPE_ADMIN = "/v1/admin/terminal-type";

    public static final String TERMINAL_TYPE_FILTERED_LIST = "/v1/admin/terminal-type/list";

    public static final String TERMINAL_TYPE_DROPDOWN_LIST = "/v1/admin/terminal-type/dropdown-list";

    public static final String TERMINAL_TYPE_ADMIN_DETAILS = "/v1/admin/terminal-type/detail";

    public static final String MERCHANT_RISK_GRADING_ADMIN = "/v1/admin/merchant-risk-grading";

    public static final String MERCHANT_RISK_GRADING_FILTERED_LIST = "/v1/admin/merchant-risk-grading/list";

    public static final String MERCHANT_RISK_GRADING_ADMIN_DETAILS = "/v1/admin/merchant-risk-grading/detail";

    public static final String MERCHANT_INWARD_LANKAQR = "/v1/lankaqr/merchant-inward";

    public static final String GENERATE_LANKAQR = "/v1/lankaqr/generateQr";

    public static final String ISO_CONVERTER_CBS_DEPOSITS = "/v1/iso/converter/deposits";

    public static final String MERCHANT_CUSTOMER_ADMIN = "/v1/admin/merchant-customer";

    public static final String MERCHANT_CUSTOMER_FILTERED_LIST = "/v1/admin/merchant-customer/list";

    public static final String MERCHANT_CUSTOMER_ADMIN_DETAILS = "/v1/admin/merchant-customer/detail";

    public static final String MERCHANT_CUSTOMER_ADMIN_CSV_UPLOAD = "/v1/admin/merchant-customer/csv-upload";

    public static final String MERCHANT_ADMIN = "/v1/admin/merchant";

    public static final String MERCHANT_FILTERED_LIST = "/v1/admin/merchant/list";

    public static final String MERCHANT_ADMIN_DETAILS = "/v1/admin/merchant/detail";

    public static final String MERCHANT_ADMIN_CSV_UPLOAD = "/v1/admin/merchant/csv-upload";
    public static final String MERCHANT_ADMIN_CIF_ALREADY_EXIT = "/v1/admin/merchant/cif-exit";

    public static final String MERCHANT_TERMINAL_ADMIN = "/v1/admin/terminal";

    public static final String MERCHANT_TERMINAL_FILTERED_LIST = "/v1/admin/terminal/list";

    public static final String MERCHANT_TERMINAL_ADMIN_DETAILS = "/v1/admin/terminal/detail";
    public static final String MERCHANT_TERMINAL_ADMIN_DETAILS_DUAL = "/v1/admin/terminal/dual/detail";
    public static final String MERCHANT_TERMINAL_MID_ALREADY_EXIT = "/v1/admin/terminal/isExit";

    public static final String MERCHANT_TERMINAL_ADMIN_QR_GENERATION = "/v1/admin/terminal/qr-generation";

    public static final String MERCHANT_TERMINAL_ADMIN_CSV_UPLOAD = "/v1/admin/terminal/csv-upload";

    public static final String MERCHANT_REQUEST_FILTERED_LIST = "/v1/admin/merchant-request/list";

    public static final String MERCHANT_REQUEST_FILTERED_PEND_LIST = "/v1/admin/merchant-request/pend-list";

    public static final String MERCHANT_REQUEST_DETAILS = "/v1/admin/merchant-request/detail";

    public static final String MERCHANT_REQUEST_PEND_DETAILS = "/v1/admin/merchant-request/pend-detail";

    public static final String MERCHANT_REQUEST_ADMIN = "/v1/admin/merchant-request";

    public static final String MERCHANT_REQUEST_CONFIRM = "/v1/admin/merchant-request/confirm";
    public static final String TERMINAL_REQUEST_CONFIRM = "/v1/admin/terminal-request/confirm";

    public static final String MERCHANT_REQUEST_REJECT = "/v1/admin/merchant-request/reject";
    public static final String TERMINAL_REQUEST_REJECT = "/v1/admin/terminal-request/reject";

    public static final String COMMON_BANK_BRANCH_VALIDATE = "/v1/switch/merchant-validation/bank-branch";

    public static final String MERCHANT_LOCATOR_LIST = "v1/merchant-locator/list";

    public static final String MERCHANT_PORTAL_USER_ADMIN = "/v1/admin/merchant-portal-user";

    public static final String MERCHANT_PORTAL_USER_PASSWORD_ADMIN = "/v1/admin/merchant-portal-user/change-password";

    public static final String MERCHANT_PORTAL_USER_NAME_RECOVER_ADMIN = "/v1/admin/merchant-portal-user/recover-username";

    public static final String MERCHANT_PORTAL_USER_FILTERED_LIST = "/v1/admin/merchant-portal-user/list";

    public static final String MERCHANT_PORTAL_USER_ADMIN_DETAILS = "/v1/admin/merchant-portal-user/detail";
    public static final String MERCHANT_PORTAL_USER_ADMIN_DETAILS_DUAL = "/v1/admin/merchant-portal-user/dual/detail";

    public static final String USER_ROLE_ADMIN_DROPDOWN_LIST = "/v1/admin/merchant-portal-user/user-role-list";

    public static final String MERCHANT_CUSTOMER_ADMIN_USERROLE_WISE_LIST = "/v1/admin/merchant-portal-user/merchant-customer-list";

    public static final String MERCHANT_TERMINAL_ADMIN_USERROLE_WISE_LIST = "/v1/admin/merchant-portal-user/merchant-terminal-list";

    public static final String MERCHANT_CATEGORY_CODE_ADMIN = "/v1/admin/merchant-category-code";

    public static final String MERCHANT_CATEGORY_CODE_FILTERED_LIST = "/v1/admin/merchant-category-code/list";

    public static final String MERCHANT_CATEGORY_CODE_ADMIN_DETAILS = "/v1/admin/merchant-category-code/detail";

    public static final String MERCHANT_CATEGORY_CODE_DROPDOWN_LIST = "/v1/admin/merchant-category-code/dropdown-list";

    public static final String TERMINAL_REQUEST_ADMIN_APPROVED = "/v1/admin/terminal-request/approved";

    public static final String TERMINAL_REQUEST_ADMIN_REJECTED = "/v1/admin/terminal-request/rejected";

    public static final String TERMINAL_REQUEST_ADMIN_FILTERED_LIST = "/v1/admin/terminal-request/list";
    public static final String TERMINAL_REQUEST_PEND_DETAILS = "/v1/admin/terminal-request/pend-detail";
    public static final String TERMINAL_REQUEST_FILTERED_PEND_LIST = "/v1/admin/terminal-request/pend-list";
    public static final String TERMINAL_REQUEST_ADMIN_DETAILS = "/v1/admin/terminal-request/detail";
    public static final String SMS_NOTIFICATION_REQUEST = "/api/v1/notificationSendRequest";
    public static final String EMAIL_SENT_REQUEST = "/api/v1/emailSendRequest";
    public static final String MERCHANT_PORTAL_USER_PEND_ADMIN_FILTERED_LIST = "/v1/admin/merchant-portal-user/pending-task";
    public static final String MERCHANT_PORTAL_USER_ADMIN_CONFIRM = "/v1/admin/merchant-portal-user/merchantPortalUserConfirm";
    public static final String MERCHANT_PORTAL_USER_ADMIN_REJECT = "/v1/admin/merchant-portal-user/merchantPortalUserReject";
    public static final String MERCHANT_PORTAL_USER_UNLOCK_USER = "/v1/admin/merchant-portal-user/unlock-user";

    public static final String MERCHANT_TERMINAL_PEND_ADMIN_FILTERED_LIST = "/v1/admin/terminal/pending-task";
    public static final String MERCHANT_TERMINAL_ADMIN_CONFIRM = "/v1/admin/terminal/merchantTerminalConfirm";
    public static final String MERCHANT_TERMINAL_ADMIN_REJECT = "/v1/admin/terminal/merchantTerminalReject";


    public static final String EXISTING_MERCHANT_ONBOARDING_REQ = "/v1/existingOnboardingRequest";
    public static final String NEW_MERCHANT_ONBOARDING_REQ = "/v1/newMerchantOnboardingRequest";
    public static final String NEW_MERCHANT_ONBOARDING_REQ_STATUS_CHECK = "/v1/newMerchantOnboardingRequest/statusCheck";
    public static final String MID_AND_TID_VERIFICATION = "/v1/terminalIdVerification";
    public static final String GET_ALL_SEC_QUESTIONS = "/v1/getAllSecurityQuestions";
    public static final String GET_USER_ANSWERED_SEC_QUESTIONS = "/v1/getUserAnsweredSecurityQuestions";
    public static final String ANSWER_SECURITY_QUESTIONS = "/v1/answerSecurityQuestions";
    public static final String CREATE_VOID_PIN = "/v1/createVoidPin";
    public static final String CREATE_MERCHANT_USER = "/v1/createMerchantUser";
    public static final String UPLOAD_MERCHANT_BUSINESS_IMAGE = "/v1/uploadBusinessImage";
    public static final String AUTH_REQUEST = "/v1/otp/authRequest";
    public static final String OTP_TRIGGER_REQUEST = "/v1/otp/otpSend";
    public static final String SPLASH_DATA = "/v1/splash/";
    public static final String GET_ALL_MERCHANT_CATEGORIES = "/v1/getAllMerchantCategories";
    public static final String GET_ALL_COMPANIES = "/v1/getAllCompanies";
    public static final String MOBILE_LOGIN = "/v1/login";
    public static final String VALIDATE = "/v1/validate";

    public static final String MOBILE_BIOMETRIC_LOGIN = "/v1/biometric/login";
    public static final String MERCHANT_PASSWORD_POLICY_UPDATE_ADMIN = "/admin/update-password-policy";
    public static final String MERCHANT_PASSWORD_POLICY_GET_ADMIN = "/admin/get-password-policy";
    public static final String CUSTOMER_ENABLE_BIOMETRIC_MOB = "/v1/enableBiometric";
    public static final String PASSWORD_VERIFY = "/v1/passwordVerify";
    public static final String T_AND_C_MOB = "/v1/tnc";
    public static final String T_AND_C_ACCEPTANCE_MOB = "/v1/tnc-acceptance";
    public static final String LANGUAGE = "/v1/language/";
    public static final String CHANGE_PASSWORD_MOB = "/v1/changePassword";
    public static final String CHANGE_PASSWORD_AUTH_INCLUDE_MOB = "/v1/authInclude/changePassword";
    public static final String RESET_PASSWORD_FORGOT_PASSWORD = "/v1/forgotPasswordReset";
    public static final String CHECK_SQ_ANSWER = "/v1/checkSQAnswer";
    public static final String VIEW_PERSONAL_INFO = "/v1/getPersonalInfo";
    public static final String GET_PROFILE_IMAGE = "/v1/profileImage/";

    //Merchant mobile user end point
    public static final String GET_MERCHANT_MOBILE_USER_FILTER_LIST = "/merchant-mobile-filter-list";
    public static final String MERCHANT_MOBILE_DEVICE_DETAILS = "/merchant-mobile-device-detail";
    public static final String MERCHANT_MOBILE_PIN_ATTEMPT_RESET = "/merchant-mobile-pin-attempt-reset";
    public static final String MERCHANT_MOBILE_PIN_RESET = "/merchant-mobile-pin-reset";
    public static final String MERCHANT_MOBILE_DEVICE_UPDATE = "/merchant-mobile-device-update";
    public static final String MERCHANT_MOBILE_DEVICE_LIST = "/merchant-mobile-device-list";
    public static final String MERCHANT_MOBILE_USERNAME_RECOVER = "/recover/username";

    public static final String V1_FUND_TRANSFER = "/fund/api/v1/fundTransfer";
    public static final String V1_FUND_TRANSFER_REVERSAL = "/fund/api/v1/fundTransferReversal";

    public static final String JUSTPAY_REFUND = "/communicator/api/v1/justPayRefund/";
    public static final String INTRA_FUND_TRANSFER_REVERSAL = "/communicator/api/v1/ReversalFundTransfer/";
    public final static String V1_INTRA_FUND_TRANSFER = "/communicator/api/v1/IntraFundTransfer/";
    public final static String V1_CEFT_FUND_TRANSFER = "/communicator/api/v1/ceftFundTransfer/";
    public final static String V1_JUSTPAY_TOPUP = "/communicator/api/v1/justPayTopUp/";

    public static final String TRANS_HISTORY_BULK_DOWNLOAD = "/v1/transactionHistoryBulkDownload/";
    public static final String TXN_DETAILS = "/v1/getTxnDetails/";
    public static final String TXN_DETAILS_FILTERED = "/v1/getTxnDetailsFiltered/";
    public static final String TXN_RECEIPT_DOWNLOAD = "/v1/downloadTxnReceipt/";
    public static final String getTranNotificationList = "/getTranNotificationList/";
    public static final String notificationMarkAsRead = "/notificationMarkAsRead/";
    public static final String notificationDelete = "/notificationDelete/";
    public static final String ADMIN_SECURITY_QUESTION_ADD = "/admin/sec-question/add";
    public static final String ADMIN_SECURITY_QUESTION_DELETE = "/admin/sec-question/delete";
    public static final String ADMIN_SECURITY_QUESTION_FILTER_LIST = "/admin/sec-question/filter-list";
    public static final String ADMIN_SECURITY_QUESTION_UPDATE = "/admin/sec-question/update";
    public static final String ADMIN_SECURITY_QUESTION_FIND = "/admin/sec-question/find";

    public static final String ADMIN_GROSS_AMOUNT_REPORT_FILTER_LIST = "/list";
    public static final String ADMIN_GROSS_AMOUNT_REPORT_DOWNLOAD = "/download/{userName}";

    public static final String SYSTEM_STATUS_CHECK = "/communicator/api/v1/getSystemStatus/";

    public static final String MERCHANT_TERMINAL_REPORT_FILTER_LIST = "/filter-list";
    public static final String MERCHANT_TERMINAL_REPORT_DOWNLOAD = "/csv-download/{username}";

    public static final String MERCHANT_REPORT_FILTER_LIST = "/filter-list";
    public static final String MERCHANT_REPORT_DOWNLOAD = "/csv-download/{username}";

    public static final String MERCHANT_CUSTOMER_REPORT_FILTER_LIST = "/filter-list";
    public static final String MERCHANT_CUSTOMER_REPORT_DOWNLOAD = "/csv-download/{username}";

    //SoundBox
    public static final String SOUNDBOX_REGISTER = "/v1/soundbox/register";
    public static final String SOUNDBOX_DYNAMIC_QR = "/v1/soundbox/requestDynamicQr";
    public static final String SOUNDBOX_TRANSACTION_STATUS_VERIFY = "v1/soundbox/transactionsStatus";
    public static final String SEND_TRAN_STATUS_TO_SOUND_BOX = "/v1/soundbox/statusToSoundBox";
    public static final String SOUNDBOX_TRANSACTION_HISTORY = "/v1/soundbox/history";
    public static final String SOUNDBOX_CANCEL = "/v1/soundbox/cancel";
}
