package acme.features.anonymous.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.tasks.Task;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractShowService;

@Service
public class AnonymousTaskShowService implements AbstractShowService<Anonymous, Task>{

	@Autowired
	protected AnonymousTaskRepository repository;
	@Override
	public boolean authorise(final Request<Task> request) {
		assert request !=null;
		boolean result;
		int taskId;
		Task task;
		
		taskId= request.getModel().getInteger("id");
		task = this.repository.findOneTaskById(taskId);
		result =task!=null&&task.getPublica()==true&&task.getFinish()==false;
		return result;
	}

	@Override
	public void unbind(final Request<Task> request, final Task entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		
		request.unbind(entity, model, "title","description","start","end","link","workload");
		model.setAttribute("taskId", entity.getId());
	}

	@Override
	public Task findOne(final Request<Task> request) {
		assert request != null;
		
		Task result;
		int id;
		
		id= request.getModel().getInteger("id");
		result = this.repository.findOneTaskById(id);
		
		return result;
	}
	

}
