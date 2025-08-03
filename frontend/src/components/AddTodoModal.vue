<template>
  <div class="fixed inset-0 bg-black/20 backdrop-blur-xs flex justify-center items-center z-50">
    <div class="bg-white p-6 rounded-xl w-1/2 shadow-lg">
      <h2 class="text-xl font-bold mb-4">Add Todo</h2>
      <form @submit.prevent="submitTodo" class="flex flex-col gap-4">
        <div class="flex gap-4">
            <div class="flex flex-col gap-2 w-3/4">
                <label class="-mb-2">Name</label>
                <input v-model="todo.name" type="text" placeholder="Todo Name" class="p-2 border rounded" required />
                <label class="-mb-2">Description</label>
                <textarea v-model="todo.description" placeholder="Deskripsi" class="p-2 border rounded" required></textarea>
            </div>
            <div class="flex flex-col gap-2 w-1/4">
                <label class="-mb-2">Start Date</label>
                <input v-model="todo.startDate" type="date" class="p-2 border rounded" required />
                <label class="-mb-2">Due Date</label>
                <input v-model="todo.endDate" type="date" class="p-2 border rounded" required />
            </div>
        </div>

        <div class="flex justify-end gap-2">
          <button type="button" @click="$emit('close')" class="px-4 py-2 border rounded">Cancel</button>
          <button type="submit" class="px-4 py-2 bg-blue-600 text-white rounded">Save</button>
        </div>
      </form>
    </div>
  </div>
</template>

<script setup>
    import { ref } from 'vue';

    const emit = defineEmits(['close', 'add-todo']);

    const todo = ref({
        name: '',
        startDate: '',
        endDate: '',
        description: ''
    });

    function submitTodo() {
        if (todo.value.name && todo.value.startDate && todo.value.endDate && todo.value.description) {
            emit('add-todo', { ...todo.value });
            todo.value = { name: '', startDate: '', endDate: '', description: '' }; 
            emit('close');
        }
    }
</script>