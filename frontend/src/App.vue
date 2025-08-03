<template>
  <div class="h-screen mx-auto p-6 bg-gray-100">
    <UserProfile />
    <div class="flex flex-row mt-4 gap-6">
      <div class="basis-1/4 gap-6 flex flex-col">
        <div>
          <h1 class="text-2xl font-bold mb-4">Todo Progress</h1>
          <TodoView 
            :todos="todos"
          />
        </div>
        <div>
          <h1 class="text-2xl font-bold mb-4">Red Zone</h1>
          <RedZone />
        </div>
        <div>
          <h1 class="text-2xl font-bold mb-4">Daily Streak</h1>
          <Streak />
        </div>
        <div class="flex flex-col items-center mt-auto">
          <img src="./assets/images/ToDoz.png" class="h-16 w-auto" alt="logo-todoz">
          <p class="text-sm text-gray-600">Made with ❤️ by Fariz Muhamad</p>
        </div>
      </div>
      <div class="basis-3/4">
        <div class="flex flex-col mb-4">        
          <h1 class="text-2xl font-bold mb-4">Todo List</h1>
          <button @click="showModal = true" class="w-34 flex gap-2 items-center bg-green-600 text-white px-4 py-2 border-2 border-black rounded-xl focus:translate-y-1 focus:shadow-none shadow-[0_4px_0_rgba(0,0,0,1)]">
            <div class="pi pi-plus text-black"></div>
            <p class="font-bold text-black">Add Todo</p>
          </button>
        </div>
    
        <ul class="space-y-2">
          <!-- Empty todos -->
          <EmptyItem v-if="todos.length === 0" />
          <!-- Display todos -->
          <TodoItem
            v-else
            v-for="(todo, index) in todos"
            :key="index"
            :todo="todo"
            @remove="removeTodo(index)"
          />
        </ul>
      </div>
    </div>
    <AddTodoModal v-if="showModal" @add-todo="addTodo" @close="showModal = false" />
  </div>
</template>

<script>
import TodoItem from './components/TodoItem.vue';
import UserProfile from './components/Header/UserProfile.vue';
import TodoView from './components/TodoView.vue';
import RedZone from './components/RedZone.vue';
import EmptyItem from './components/EmptyItem.vue';
import AddTodoModal from './components/AddTodoModal.vue';
import Streak from './components/Streak.vue';

export default {
  components: {
    TodoItem,
    UserProfile,
    TodoView,
    RedZone,
    EmptyItem,
    AddTodoModal,
    Streak
  },
  data() {
    return {
      showModal: false,
      todos: [],
    };
  },
  methods: {
    addTodo(todo) {
      this.todos.push({ 
        ...todo, 
      });
    },
    removeTodo(index) {
      this.todos.splice(index, 1);
    },
  },
};
</script>
