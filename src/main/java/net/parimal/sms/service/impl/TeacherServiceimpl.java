package net.parimal.sms.service.impl;
import java.util.List;
import net.parimal.sms.entity.Teacher;
import net.parimal.sms.repository.TeacherRepository;
import net.parimal.sms.service.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceimpl implements TeacherService {

    private TeacherRepository teacherRepository;

    public TeacherServiceimpl(TeacherRepository teacherRepository) {
        super();
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return null;
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return null;
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public void deleteTeacherById(Long id) {

    }
}
