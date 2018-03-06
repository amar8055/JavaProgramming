package Courses;

public class Topic {

		private int topic_id;
		private String t_name;
		private int t_duration;
		public int getTopic_id() {
			return topic_id;
		}
		public void setTopic_id(int topic_id) {
			this.topic_id = topic_id;
		}
		public String getT_name() {
			return t_name;
		}
		public void setT_name(String t_name) {
			this.t_name = t_name;
		}
		public int getT_duration() {
			return t_duration;
		}
		@Override
		public String toString() {
			return "Topic [topic_id=" + topic_id + ", t_name=" + t_name + ", t_duration=" + t_duration + "]";
		}
		public void setT_duration(int t_duration) {
			this.t_duration = t_duration;
		}
		
		

	

	

}
