Chứa các file và code cho assigment1 (Testing System Java OOP)
1. Question 1: Sử dụng lại DB Testing System với các bảng dữ liệu, ràng buộc và kiểu dữ liệu như dưới. Hãy chuyển sang các Object Java và tối ưu lại các thuộc tính.
Table 1:Department
∙ DepartmentID: định danh của phòng ban (auto increment)
∙ DepartmentName: tên đầy đủ của phòng ban (VD: sale, marketing, …)
Table 2: Position
∙ PositionID: định danh của chức vụ (auto increment)
∙ PositionName: tên chức vụ (Dev, Test, Scrum Master, PM)
Table 3: Account
∙ AccountID: định danh của User (auto increment)
∙ Email:
∙ Username:
∙ FullName:
∙ DepartmentID: phòng ban của user trong hệ thống
∙ PositionID: chức vụ của User
∙ CreateDate: ngày tạo tài khoản
Table 4: Group
∙ GroupID: định danh của nhóm (auto increment)
∙ GroupName: tên nhóm
∙ CreatorID: id của người tạo group
∙ CreateDate: ngày tạo group
Table 5: GroupAccount
∙ GroupID: định danh của nhóm
∙ AccountID: định danh của User
∙ JoinDate: Ngày user tham gia vào nhóm
Table 6: TypeQuestion
∙ TypeID: định danh của loại câu hỏi (auto increment)
∙ TypeName: tên của loại câu hỏi (Essay, Multiple-Choice)
Table 7: CategoryQuestion
∙ CategoryID: định danh của chủ đề câu hỏi (auto increment)
∙ CategoryName: tên của chủ đề câu hỏi (Java, .NET, SQL, Postman, Ruby,…)
Table 8: Question
∙ QuestionID: định danh của câu hỏi (auto increment)
∙ Content: nội dung của câu hỏi
∙ CategoryID: định danh của chủ đề câu hỏi
∙ TypeID: định danh của loại câu hỏi
∙ CreatorID: id của người tạo câu hỏi
∙ CreateDate: ngày tạo câu hỏi
Table 9: Answer
∙ AnswerID: định danh của câu trả lời (auto increment)
∙ Content: nội dung của câu trả lời
∙ QuestionID: định danh của câu hỏi
∙ isCorrect: câu trả lời này đúng hay sai
Table 10: Exam
∙ ExamID: định danh của đề thi (auto increment)
∙ Code: mã đề thi
∙ Title: tiêu đề của đề thi
∙ CategoryID: định danh của chủ đề thi
∙ Duration: thời gian thi
∙ CreatorID: id của người tạo đề thi
∙ CreateDate: ngày tạo đề thi
Table 11: ExamQuestion
∙ ExamID: định danh của đề thi
∙ QuestionID: định danh của câu hỏi

2. Question 2:
Tạo file Program.java có chứa main() method và khởi tạo ít nhất 3 đối tượng đối với mỗi table trong java
3. Question 3:
Trong file Program.java, hãy in ít nhất 1 giá trị của mỗi đối tượng ra.

